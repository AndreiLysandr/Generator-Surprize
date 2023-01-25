package ProiectDoi;
import java.util.ArrayList;
import java.util.Random;

public class Candies implements ISurprise {
    private int nrOfCandies;
    private String typeOfCandie;
    private static ArrayList <String> candyType;
    private static boolean candyTypeCache;
    private static final CandyTypes type = new CandyTypes();
    private static Random random;

    private Candies(int nrOfCandies, String typeOfCandie) {
        this.nrOfCandies = nrOfCandies;
        this.typeOfCandie = typeOfCandie;
    }

    public Candies() {
        this.typeOfCandie = generate().typeOfCandie;
        this.nrOfCandies = generate().nrOfCandies;
    }

    private static void initCandyType() {
        candyType = new ArrayList<>();

        for (int i = 0; type.candyType(i) != null; i++) {
            candyType.add(type.candyType(i));
        }
        candyTypeCache = true;
        random = new Random();
    }

    private static Candies generate() {
        if (!candyTypeCache) {
            initCandyType();
        }

        String candy = candyType.get(random.nextInt(candyType.size()));
        int noOfCandies = random.nextInt(5, 21);

        return new Candies(noOfCandies, candy);

    }
    @Override
    public void enjoy() {
        generate();
        System.out.println("You received " + this.nrOfCandies + " " + this.typeOfCandie + " candies!");
    }

    @Override
    public String toString() {
        return this.nrOfCandies + " " + this.typeOfCandie + " candies";
    }
}
