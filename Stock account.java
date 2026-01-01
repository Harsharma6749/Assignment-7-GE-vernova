import java.util.ArrayList;
import java.util.Date;

public class StockAccount {

    ArrayList<CompanyShares> list = new ArrayList<>();

    StockAccount(String filename) {
        System.out.println("account created from file : " + filename);
    }

    double valueof() {
        double total = 0;
        for (CompanyShares c : list) {
            total += c.shares * 100;
        }
        return total;
    }

    void buy(int amount, String symbol) {
        CompanyShares c = new CompanyShares();
        c.symbol = symbol;
        c.shares = amount;
        c.date = new Date();
        list.add(c);
        System.out.println("shares bought");
    }

    void sell(int amount, String symbol) {
        for (CompanyShares c : list) {
            if (c.symbol.equals(symbol)) {
                c.shares = c.shares - amount;
                System.out.println("shares sold");
                return;
            }
        }
        System.out.println("stock not found");
    }

    void save(String filename) {
        System.out.println("account saved to file : " + filename);
    }

    void printreport() {
        for (CompanyShares c : list) {
            System.out.println(c.symbol + " : " + c.shares + " shares");
        }
    }
}
