import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StockPortfolio p = new StockPortfolio();

        System.out.print("enter number of stocks : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            Stock s = new Stock();

            System.out.print("enter stock name : ");
            s.name = sc.next();

            System.out.print("enter number of shares : ");
            s.shares = sc.nextInt();

            System.out.print("enter share price : ");
            s.price = sc.nextDouble();

            p.addstock(s);
        }

        p.printreport();
    }
}
