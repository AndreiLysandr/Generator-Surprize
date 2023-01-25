package ProiectDoi;
import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {
    private String message;
    private static ArrayList<String> quotes;
    private static boolean quotesCache;
    private static final Quotes q = new Quotes();
    private static Random random;


    private FortuneCookie(String message) {
        this.message = message;
    }

    public FortuneCookie() {
        this.message = generate().message;
    }

    private static void initQuotes() {
        quotes = new ArrayList<>();

        for (int i = 0; q.quote(i) != null; i++) {
            quotes.add(q.quote(i));
        }
        quotesCache = true;
        random = new Random();
    }

    private static FortuneCookie generate() {
        if (!quotesCache) {
            initQuotes();
        }

        String newQuote = quotes.get(random.nextInt(quotes.size()));

        return new FortuneCookie(newQuote);
    }

    @Override
    public void enjoy() {
        generate();
        System.out.println("You received a fortune cookie with the following message: " + this.message);
    }

    @Override
    public String toString() {
        return this.message;
    }
}
