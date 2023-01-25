package ProiectDoi;
import java.util.ArrayList;

public class MinionToy implements ISurprise {
    private String minionName;
    private static ArrayList<String> toyName;
    private static boolean toyNameCache;
    private static final MinionNames names = new MinionNames();
    private static int count;

    private MinionToy(String minionName) {
        this.minionName = minionName;
    }

    public MinionToy() {
        this.minionName = generate().minionName;
    }

    private static void initMinionName() {
        toyName = new ArrayList<>();

        for (int i = 0; names.names(i) != null; i++) {
            toyName.add(names.names(i));
        }
        toyNameCache = true;
        count = 0;
    }

    private static MinionToy generate() {
        if (!toyNameCache) {
            initMinionName();
        }

        if (count == toyName.size()) {
            count = 0;
        }

        return new MinionToy(toyName.get(count++));
    }

    @Override
    public void enjoy() {
        generate();
        System.out.println("You received a minion toy named \"" + minionName + "\"!");
    }

    @Override
    public String toString() {
        return this.minionName;
    }
}
