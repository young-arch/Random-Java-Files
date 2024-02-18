public class Stock {
    private String symbol;
    private double sharePrice;

    /**
     * Constructor
     * 
     * @param sym   The stock's trading symbol.
     * @param price The stock's share price
     */

    public Stock(String sym, double price) {
        symbol = sym;
        sharePrice = price;
    }

    /**
     * getSymbol method
     * 
     * @return The stock's trading symbol
     */

    public String getSymbol() {
        return symbol;
    }

    /**
     * getSharePrice method
     * 
     * @return The stock's share price
     */

    public double getSharePrice() {
        return sharePrice;
    }

    /**
     * toString method
     * 
     * @return A string indicating the object's trading symbol
     *         and share price
     */

    public String toString() {
        // Create a String describing the stock
        String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
        return str;

    }

    public boolean equals(Stock object2) {
        boolean status;
        if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public Stock copy() {
        Stock copyObject = new Stock(symbol, sharePrice);
        return copyObject;
    }

    public Stock(Stock object2) {
        symbol = object2.symbol;
        sharePrice = object2.sharePrice;
    }

}
