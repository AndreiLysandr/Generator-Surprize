package ProiectDoi;

import java.util.ArrayList;

public abstract class GenericBag implements IBag {

    protected abstract ArrayList<ISurprise> getBag();

    @Override
    public final boolean isEmpty() {
        return getBag().isEmpty();
    }

    @Override
    public final int size() {
        return getBag().size();
    }
}
