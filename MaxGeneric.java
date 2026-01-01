public class MaxGeneric {

    static <T extends Comparable<T>> T max(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max(10, 5, 3));
        System.out.println(max(2.5f, 7.5f, 1.1f));
        System.out.println(max("apple", "peach", "banana"));
    }
}
