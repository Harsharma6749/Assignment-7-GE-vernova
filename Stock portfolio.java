import java.util.ArrayList;

public class StockPortfolio {

    ArrayList<Stock> list = new ArrayList<>();

    void addstock(Stock s) {
        list.add(s);
    }

    void printreport() {
        double total = 0;

        for (Stock s : list) {
            double value = s.getvalue();
            total += value;

            System.out.println("stock name : " + s.name);
            System.out.println("stock value : " + value);
            System.out.println();
        }

        System.out.println("total value : " + total);
    }
}
