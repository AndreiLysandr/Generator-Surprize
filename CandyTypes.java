package ProiectDoi;

public class CandyTypes {
    public String candyType(int n) {
        switch (n) {
            case 0:
                return "chocolate";
            case 1:
                return "vanilla";
            case 2:
                return "jelly bean";
            case 3:
                return "gummy bear";
            case 4:
                return "hard";
            case 5:
                return "liquor";
            case 6:
                return "sour";
            case 7:
                return "fruit";
            case 8:
                return "marshmallow";
            case 9:
                return "coconut";
            case 10:
                return "coffee";
            default:
                return null;
        }
    }
    public int noOfCandyTypes() {
        return 10;
    }
}
