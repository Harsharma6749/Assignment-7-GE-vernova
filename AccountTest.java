public class AccountTest {
    public static void main(String[] args) {

        Account a = new Account();

        a.debit(12000);
        a.debit(3000);

        System.out.println("final balance : " + a.balance);
    }
}
