package ProiectDoi;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

    IBag bag;

    int waitTime;

    AbstractGiveSurprises(String bagType, int waitingTime) {}

    abstract void put(ISurprise newSurprise);

    abstract void put(IBag surprises);

    abstract void give();

    abstract void giveAll();

    boolean isEmpty() {
        return getBag().isEmpty();
    }

    abstract IBag getBag();

    abstract void giveWithPassion();
}
