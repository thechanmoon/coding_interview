public class Memoization {
    public static int fibonachi_recursive(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        }

        // base cases
        if (n == 0 || n == 1) {
            return n;
        }

        System.out.printf("computing fib(%d)\n", n);
        return fibonachi_recursive(n - 1) + fibonachi_recursive(n - 2);
    }

    public static int fibonachi(int n, int[] r) {
        if (n < 0)
            return 0;
        else if (n < 2)
            return r[n] = 1;
        else
            return r[n] = fibonachi(n - 1, r) + fibonachi(n - 2, r);
    }

    public static void main(final String[] args) {
        int[] array = new int[10];
        // System.out.println(fibonachi(2, array));
        // System.out.println(fibonachi(3, array));
        // System.out.println(fibonachi(4, array));
        // System.out.println(fibonachi(5, array));

        // for (int i = 0; i < array.length; i++)
        // System.out.println(fibonachi(i, array));

        System.out.println(fibonachi_recursive(10));
    }
}
