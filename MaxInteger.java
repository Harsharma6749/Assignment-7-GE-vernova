public class MaxInteger {

    static Integer max(Integer a, Integer b, Integer c) {

        Integer max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max(10, 5, 3));   // max at 1st position
        System.out.println(max(3, 15, 5));   // max at 2nd position
        System.out.println(max(4, 6, 20));   // max at 3rd position
    }
}
