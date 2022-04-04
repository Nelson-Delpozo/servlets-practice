public class QuotesDaoFactory {
    private static Quotes quotesDao;

    public static Quotes getQuotesDao() {
        if (quotesDao == null) {
            quotesDao = new ListQuotesDao();
        }
        return quotesDao;
    }
}
