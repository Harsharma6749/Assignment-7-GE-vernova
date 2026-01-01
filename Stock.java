public class Stock {
    String name;
    int shares;
    double price;

    double getvalue() {
        return shares * price;
    }
}
