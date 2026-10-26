package pluralsight;

public class Quotes {

    private int quoteNumber;
    private String quoteText;


    public Quotes(int quoteNumber, String quoteText) {
        this.quoteText = quoteText;
        this.quoteNumber = quoteNumber;
    }

    public int getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(int quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }
}
