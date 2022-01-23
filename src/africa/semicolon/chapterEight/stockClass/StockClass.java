package africa.semicolon.chapterEight.stockClass;

public class StockClass {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public StockClass(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(double currentPrice, double previousPrice) {
        return ((currentPrice - previousPrice)*100)/10;
    }
}
