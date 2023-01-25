package ProiectDoi;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static GatherSurprises instance;
    private static Random random;

    private GatherSurprises() {

    }

    public static GatherSurprises getInstance() {
        if (instance == null) {
            instance = new GatherSurprises();
        }
        return instance;
    }

    public static ISurprise gather() {
        random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                return new FortuneCookie();
            case 1:
                return new Candies();
            case 2:
                return new MinionToy();
            default:
                return null;
        }
    }

    public static ArrayList<ISurprise> gather(int n) {
        ArrayList<ISurprise> instanceArray = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            instanceArray.add(gather());
        }

        return instanceArray;
    }
}
