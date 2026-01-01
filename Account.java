public class Account {

    double balance = 10000;

    void debit(double amount) {
        if (amount > balance) {
            System.out.println("debit amount exceeded account balance");
        } else {
            balance = balance - amount;
            System.out.println("amount debited : " + amount);
        }
    }
}
