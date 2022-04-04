import java.util.ArrayList;
import java.util.List;

public class ListQuotesDao implements Quotes {
    private List<Quote> quotes;

    public List<Quote> all() {
        if (quotes == null) {
            quotes = generateQuotes();
        }
        return quotes;
    }

    private List<Quote> generateQuotes() {
        List<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote(
                "I have no idea what's going on right now",
                "Towelie",
                1
        ));
        quotes.add(new Quote(
                "Come and get your love",
                "Redbone",
                2
        ));
        quotes.add(new Quote(
                "To be or not to be, that is the question",
                "Hamlet",
                3
        ));

        return quotes;
    }
}

