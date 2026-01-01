public class MaxFloat {

    static Float max(Float a, Float b, Float c) {

        Float max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max(2.5f, 1.1f, 0.5f));
        System.out.println(max(1.2f, 5.6f, 3.3f));
        System.out.println(max(3.3f, 4.4f, 9.9f));
    }
}
