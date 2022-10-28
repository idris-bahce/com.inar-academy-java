package chapters.chapter09.exercises.Exercise9_02;

public class Stock {

    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        double change = currentPrice - previousClosingPrice;
        return (change / previousClosingPrice) * 100.0;
    }
}
