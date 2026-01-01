import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

    static int getrandom(int n) {
        Random r = new Random();
        return r.nextInt(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of coupons : ");
        int n = sc.nextInt();

        boolean[] used = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n) {
            int num = getrandom(n);
            count++;

            if (!used[num]) {
                used[num] = true;
                distinct++;
            }
        }

        System.out.println("random numbers needed : " + count);
    }
}
