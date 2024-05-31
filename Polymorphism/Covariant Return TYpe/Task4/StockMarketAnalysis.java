// Scenario 4: Stock Market Analysis
// In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

class Stock {
    String name;

    Stock(String name) {
        this.name = name;
    }

    Stock getStockData() {
        System.out.println("\n Name of Stock:" + name);
        return this;
    }
}

class TechStock extends Stock {
    int no_of_stocks;

    TechStock(String name, int no_of_stocks) {
        super(name);
        this.no_of_stocks = no_of_stocks;
    }

    TechStock getStockData() {
        super.getStockData();
        System.out.println("No of stocks:" + no_of_stocks);
        return this;
    }
}

class PharmaStock extends Stock {
    int no_of_stocks;

    PharmaStock(String name, int no_of_stocks) {
        super(name);
        this.no_of_stocks = no_of_stocks;
    }

    PharmaStock getStockData() {
        super.getStockData();
        System.out.println("No of stocks:" + no_of_stocks);
        return this;
    }
}
public class StockMarketAnalysis{
    public static void main(String[] args) {
        Stock s;
        s = new TechStock("TechStock", 20);
        s.getStockData();
        s = new PharmaStock("PharmStock", 30);
        s.getStockData();
    }
} 
