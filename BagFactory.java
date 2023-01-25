package ProiectDoi;

public class BagFactory implements IBagFactory {
    public static BagFactory instance;

    private BagFactory() {

    }

    public static BagFactory getInstance() {
        if (instance == null) {
            instance = new BagFactory();
        }
        return instance;
    }

    @Override
    public IBag makeBag(String s) {
        switch (s.toLowerCase()) {
            case "random":
                return new RandomOrderBag();
            case "fifo":
                return new FIFO_Bag();
            case "lifo":
                return new LIFO_Bag();
            default:
                return null;
        }
    }

    public String randomType() {
        return "random";
    }

    public String fifoType() {
        return "fifo";
    }

    public String lifoType() {
        return "lifo";
    }
}
