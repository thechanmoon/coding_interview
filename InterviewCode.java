import java.lang.Math;

public class InterviewCode {

    // Example 1
    static void foo(int[] array) {
        int sum = 0;
        int product = 1;
        // for (int num : array) {
        // sum += num;
        // product *= num;
        // }
        // for (int i = 0; i < array.length; i++) {
        // sum += array[i];
        // product *= array[i];
        // }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            // product *= array[i];
        }

        for (int i = 0; i < array.length; i++) {
            // sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum = " + sum + " , " + "Product = " + product);
    }

    // Example 4
    static void printPair(int[] array) {
        // for (int num_1 : array)
        // for (int num_2 : array) {
        // System.out.println(num_1 + " , " + num_2);
        // }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + " , " + array[j]);
            }
        }
    }

    // Example 3
    static void printUnoderedPair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + " , " + array[j]);
            }
        }
    }

    // Example 4
    static void printUnoderedPair(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + " , " + arrayB[j]);
                }
            }
        }
    }

    // Example 5
    // static void printUnoderedPair(int[] arrayA, int[] arrayB) {
    // for (int i = 0; i < arrayA.length; i++) {
    // for (int j = 0; j < arrayB.length; j++) {
    // for (int k = 0; k < 100000; k++) {
    // System.out.println(arrayA[i] + " , " + arrayB[j]);
    // }
    // }
    // }
    // }

    // Example 6
    // static int[] reverse(int[] array) {
    // for (int i = 0; i < array.length / 2; i++) {
    // int temp = 0;

    // temp = array[i];
    // array[i] = array[array.length - 1 - i];
    // array[array.length - 1 - i] = temp;
    // }
    // return array;
    // }

    static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = 0;

            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    // Example 10
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // static boolean isPrime(int n) {
    // // Corner case
    // for (int i = 2; i * i < n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // static boolean isPrime(int n) {
    // // Corner case
    // for (int i = 2; i < Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // Example 11
    static int factorial(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Example 12
    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("str.length() == 0 prefix = " + prefix);
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                System.out.println("str : " + str);
                System.out.println("str.substring(0, i)" + str.substring(0, i));
                System.out.println("str.substring(i + 1)" + str.substring(i + 1));
                System.out.println("rem : " + rem);
                System.out.println("prefix : " + prefix);
                System.out.println("str.charAt(i) : " + str.charAt(i));
                System.out.println("prefix + str.charAt(i) : " + prefix + str.charAt(i));
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println("Test");

        // Example 1
        // int[] array = { 1, 2, 3, 4 };
        // foo(array);

        // Example 2
        // int[] array = { 1, 2, 3, 4 };
        // printPair(array);

        // Example 3
        // int[] array = { 1, 2, 3, 4 };
        // printUnoderedPair(array);

        // Example 4
        // int[] arrayA = { 1, 2, 3, 4 };
        // int[] arrayB = { 1, 2, 3, 4 };
        // printUnoderedPair(arrayA, arrayB);

        // Example 5
        // int[] arrayA = { 1, 2, 3, 4 };
        // int[] arrayB = { 1, 2, 3, 4 };
        // printUnoderedPair(arrayA, arrayB);

        // Example 6
        // int[] array = { 1, 2, 3, 4 };
        // reverse(array);
        // for (int num : array) {
        // System.out.println(" " + num);
        // }

        // Example 10
        // for (int i = 0; i < 10; i++) {
        // if (isPrime(i)) {
        // System.out.println(i + " is prime");
        // } else {
        // System.out.println(i + " is not prime");
        // }
        // }

        // Example 11
        // for (int i = 0; i < 10; i++) {
        // // System.out.println(Integer.toString(factorial(i)));
        // System.out.println(factorial(i));
        // // System.out.println(factorial(i) + "");
        // }

        // Example 12
        // for (int i = 0; i < 10; i++) {
        // String str = "TempText" + Integer.toString(i);
        // permutation(str);
        // System.out.println("======");
        // System.out.println(str);
        // }

        String str = "Te";
        permutation(str);
        System.out.println("======");
        System.out.println(str);
    }
}
