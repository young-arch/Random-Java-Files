public class StockPurchaseTry {

    private Stock stock;
    private int shares;

    public StockPurchaseTry(Stock stockObject, int numShares) {
        stock = new Stock(stockObject);
        shares = numShares;
    }

    public Stock getStock() {
        return new Stock(stock);
    }

    public int getShares() {
        return shares;
    }

    public double getCost() {
        return shares * stock.getSharePrice();
    }

}
