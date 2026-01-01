import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("press enter to start");
        sc.nextLine();
        long start = System.currentTimeMillis();

        System.out.println("press enter to stop");
        sc.nextLine();
        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println("elapsed time in milliseconds : " + time);
    }
}
