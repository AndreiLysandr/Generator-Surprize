package ProiectDoi;
import java.util.ArrayList;

public class FIFO_Bag extends GenericBag {
    private ArrayList<ISurprise> fifoBag;


    @Override
    public ArrayList<ISurprise> getBag() {
        return this.fifoBag;
    }

    @Override
    public void put(ISurprise newSurprise) {
        if (fifoBag == null) {
            fifoBag = new ArrayList<>();
        }

        fifoBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        if (bagOfSurprises == null) {
            System.out.println("There are no surprises in this bag!");
            return;
        }

        if (fifoBag == null) {
            fifoBag = new ArrayList<>();
        }

        int size = bagOfSurprises.size();

        for (int i = 0; i < size; i++) {
            fifoBag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        return fifoBag.remove(0);
    }

    public String bagType() {
        return "fifo";
    }
}
