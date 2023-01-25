package ProiectDoi;

import java.util.concurrent.TimeUnit;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
    private IBag bag;
    private int waitingTime;
    private final BagFactory newBag = BagFactory.getInstance();

    public GiveSurpriseAndSing(String bagType, int waitingTime) {
        super(bagType, waitingTime);
        this.waitingTime = waitingTime;
        bag = newBag.makeBag(bagType);
    }

    @Override
    public void put(ISurprise newSurprise) {
        bag.put(newSurprise);
    }

    @Override
    public void put(IBag surprises) {
        bag.put(surprises);
    }

    @Override
    public void give() {
        if (bag.isEmpty()) {
            System.out.println("The bag is empty! \nTry refilling it again with another surprises!");
            return;
        }
        bag.takeOut().enjoy();
        giveWithPassion();
    }

    @Override
    public void giveAll() {
        if (bag.isEmpty()) {
            System.out.println("The bag is empty! \nTry refilling it again with another surprises!");
            return;
        }

        int i = bag.size();
        while (i != 0) {
            if (i == 1) {
                bag.takeOut().enjoy();
                giveWithPassion();
                return;
            }
            bag.takeOut().enjoy();
            giveWithPassion();
            i--;

            try {
                TimeUnit.SECONDS.sleep(waitingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    IBag getBag() {
        return this.bag;
    }

    @Override
    void giveWithPassion() {
        System.out.println("Singing a jolly song to you, for the kind heart that hides inside of you \u2661 !!!\n");
    }
}
