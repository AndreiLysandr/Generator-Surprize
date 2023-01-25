package ProiectDoi;

public class ProiectDoiInfo {

    public static void essentialInfo() {
        System.out.println("\nBefore we start you should know that:"
                + "\nThere are 3 types of surprises currently implemented:"
                + "\n\t- Fortune Cookies"
                + "\n\t- Candies"
                + "\n\t- Minion Toys"
                + "\n\nThere are 3 types of bags currently implemented"
                + "\n\t- Random Order bag (the surprises are stuffed and taken out in a random order)"
                + "\n\t- FIFO bag (first surprise that goes inside the bag is the first one to be taken out of the bag)"
                + "\n\t- LIFO bag (last surprise that goes inside the bag is the first one to be taken out of the bag)");
    }

    public static void commands() {
        System.out.println("\n 1.  Create a new Surprise"
                + "\n 2.  Create a certain number of surprises"
                + "\n 3.  Let us do the work here, and we'll create a random number of surprises"
                + "\n 4.  Check how many surprises you currently have"
                + "\n 5.  Create a new bag"
                + "\n 6.  Let us do the work again, and we'll create the 3 types of bags for you"
                + "\n 7.  Choose 2 bags: 1 to put surprises in and 1 to take surprises out"
                + "\n 8.  Choose 2 bags: a bag from which to remove a surprise and a bag in which to put a surprise"
                + "\n 9.  Let us populate your bags with surprises"
                + "\n10.  Share surprises"
                + "\n11.  Help"
                + "\n12.  Exit");
    }

    public static void newFortuneCookie() {
        System.out.println("Great, you just created a new FortuneCookie!");
    }

    public static void newCandie() {
        System.out.println("Great, you just created a new Candie!");
    }

    public static void newMinionToy() {
        System.out.println("Great, you just created a new MinionToy!");
    }

    public static void randomlyGenerated(int n) {
        System.out.println("Congratulations, " + n + " random surprises were generated!");
    }

    public static void chooseBagType() {
        System.out.println("Please type down what type of bag you want to create:"
                + "\n- random (for a random order bag)"
                + "\n- fifo (for a first in, first out bag)"
                + "\n- lifo (for a last in, last out bag)\n");
    }

    public static void newRandomOrderBag() {
        System.out.println("Great, you just created a new RandomOrder bag");
    }

    public static void existingRandom() {
        System.out.println("Sorry, but a RandomOrder bag already exists! Try creating another bag instead!");
    }

    public static void newFIFOBag() {
        System.out.println("Great, you just created a new FIFO bag");
    }

    public static void existingFIFO() {
        System.out.println("Sorry, but a FIFO bag already exists! Try creating another bag instead!");
    }
    public static void newLIFOBag() {
        System.out.println("Great, you just created a new LIFO bag");
    }

    public static void existingLIFO() {
        System.out.println("Sorry, but a LIFO bag already exists! Try creating another bag instead!");
    }

    public static void alreadyInitBags() {
        System.out.println("The RandomOrder, FIFO and LIFO bags have already been created!");
    }

    public static void errSurprises(int n) {
        System.out.println("You don't have any surprise generated, therefore,"
                + " we generated " + n + " surprises for you");
    }

    public static void errBags(String s) {
        System.out.println("\n\"" + s + "\" is not a valid type of bag."
                + " We'll remind you that only \"random\", \"fifo\" and \"lifo\" bags are implemented!"
                + "\nPlease choose again the type of bag you want to create:\n");
    }

    public static void initAll() {
        System.out.println("We've created all types of bags successfully!!");
    }

    public static void choosePut(String singleOrAll) {
        if (singleOrAll.equalsIgnoreCase("all")) {
            System.out.println("\nChoose a bag in which to put surprises from:"
                    + "\n- random"
                    + "\n- fifo"
                    + "\n- lifo");
        }
        else if (singleOrAll.equalsIgnoreCase("single")) {
            System.out.println("\nChoose a bag in which to put one surprise from:"
                    + "\n- random"
                    + "\n- fifo"
                    + "\n- lifo");
        }
        System.out.println();
    }

    public static void chooseTakeOut(String singleOrAll) {
        if (singleOrAll.equalsIgnoreCase("all")) {
            System.out.println("Choose a bag from which to remove surprises from:"
                    + "\n- random"
                    + "\n- fifo"
                    + "\n- lifo");
        }
        else if (singleOrAll.equalsIgnoreCase("single")) {
            System.out.println("Choose a bag from which to remove one surprise from:"
                    + "\n- random"
                    + "\n- fifo"
                    + "\n- lifo");
        }
        System.out.println();
    }

    public static void tryAnotherBag() {
        System.out.println("\nYou can't use the same bag! Try using another bag instead!");
    }

    public static void successPut() {
        System.out.println("\nThe surprises have been moved successfully!"
                + "\nNow the other bag is empty!");
    }

    public static void successPutSingle() {
        System.out.println("\nThe surprise have been moved successfully!");
    }

    public static void unsuccessfulPut() {
        System.out.println("\nThe surprises could not be moved!"
                + " \nOne of the bags is empty, try filling the bags with surprises!");
    }

    public static void unsuccessfulPutSingle() {
        System.out.println("\nThe surprise could not be moved!"
                + " \nOne of the bags is empty, try filling the bags with surprises!");
    }

    public static void noBags() {
        System.out.println("\nThere are no bags created!");
    }

    public static void moreSurprises() {
        System.out.println("What a miracle!!! A lot of surprises filled your bags!!!");
    }

    public static void populatedBags() {
        System.out.println("Your bags are filled with surprises now!");
    }

    public static void chooseShareMethod() {
        System.out.println("Choose how you want to share your surprises:"
                + "\n1. surprise and applause"
                + "\n2. surprise and singing"
                + "\n3. surprise and a hug");
    }

    public static void waitingTime() {
        System.out.println("\nHow much time you want to wait between each shared surprise? (seconds)");
    }

    public static void bagToShare() {
        System.out.println("\nFrom which bag do you want to share the surprises?"
                + "\n- random"
                + "\n- fifo"
                + "\n- lifo");
    }

    public static void howToShare() {
        System.out.println("\nHow you want to share:"
                + "\n1. Only one surprise"
                + "\n2. All the surprises that are inside the bag");
    }

    public static void exit() {
        System.out.println("We hope you enjoyed our program and we wish to improve even more."
                + " Please let us a feedback \u2661");
    }

    public static void initTakeOut() {
        System.out.println("We'll fill the bag for you with surprises!");
    }
}
