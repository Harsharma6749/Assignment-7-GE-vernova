public class MaxString {

    static String max(String a, String b, String c) {

        String max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max("apple", "peach", "banana"));
    }
}
