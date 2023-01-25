package ProiectDoi;
import java.util.ArrayList;
import java.util.Random;

public class RandomOrderBag extends GenericBag {

    private ArrayList<ISurprise> randomBag;
    private Random random = new Random();


    @Override
    public ArrayList<ISurprise> getBag() {
        return this.randomBag;
    }

    @Override
    public void put(ISurprise newSurprise) {
        if (randomBag == null) {
            randomBag = new ArrayList<>();
            randomBag.add(newSurprise);
        }
        else {
            randomBag.add(random.nextInt(randomBag.size()), newSurprise);
        }
    }

    @Override
    public void put(IBag bagOfSurprises) {
        if (bagOfSurprises == null) {
            System.out.println("There are no surprises in this bag!");
            return;
        }

        if (randomBag == null) {
            randomBag = new ArrayList<>();
        }

        int size = bagOfSurprises.size();
        for (int i = 0; i < size; i++) {
            if (randomBag.size() == 0) {
                randomBag.add(bagOfSurprises.takeOut());
            }
            else {
                randomBag.add(random.nextInt(randomBag.size()), bagOfSurprises.takeOut());
            }
        }
    }

    @Override
    public ISurprise takeOut() {
        return randomBag.remove(random.nextInt(randomBag.size()));
    }

    public String bagType() {
        return "random";
    }
}
