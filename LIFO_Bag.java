package ProiectDoi;
import java.util.ArrayList;

public class LIFO_Bag extends GenericBag {
    private ArrayList<ISurprise> lifoBag;


    @Override
    public ArrayList<ISurprise> getBag() {
        return this.lifoBag;
    }

    @Override
    public void put(ISurprise newSurprise) {
        if (lifoBag == null) {
            lifoBag = new ArrayList<>();
        }

        lifoBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        if (bagOfSurprises == null) {
            System.out.println("There are no surprises in this bag!");
            return;
        }

        if (lifoBag == null) {
            lifoBag = new ArrayList<>();
        }

        int size = bagOfSurprises.size();
        for (int i = 0; i < size; i++) {
            lifoBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        return lifoBag.remove(lifoBag.size() - 1);
    }

    public String bagType() {
        return "lifo";
    }
}
