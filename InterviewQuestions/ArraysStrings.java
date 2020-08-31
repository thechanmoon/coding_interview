import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArraysStrings {
    // 1.1 Is Unique: Implement an algorithm to determine if a string has all unique
    // characters. What if you cannot use additional data structures?
    static boolean isUnique(final String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("str.charAt(" + i + ") " + str.charAt(i));
                    System.out.println("str.charAt(" + j + ") " + str.charAt(j));
                    return false;
                }
            }

        }
        return true;
    }

    static boolean isUniqueChar(String str) {
        final int ARRAY_LENGTH = 128;

        if (str.length() > ARRAY_LENGTH)
            return false;

        boolean[] bAsciiTable = new boolean[ARRAY_LENGTH];
        int asciiCode = 0;
        for (int index = 0; index < str.length(); index++) {
            asciiCode = str.charAt(index);
            if (bAsciiTable[asciiCode] == true) {
                return false;
            }
            bAsciiTable[asciiCode] = true;
        }
        return true;
    }

    public static void main(final String[] args) {

        // 1.1 Is Unique: Implement an algorithm to determine if a string has all unique
        // characters. What if you cannot use additional data structures?

        // InputStream in = System.in;
        // InputStreamReader reader = new InputStreamReader(in);
        // BufferedReader br = new BufferedReader(reader);

        // String a = "";
        // while (!a.equals("quit")) {
        // System.out.println("a : " + a);
        // try {
        // a = br.readLine();
        // System.out.println(a);
        // System.out.println("isUnique(a) : " + isUnique(a));
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // }
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("exit")) {
            // System.out.println("isUnique(a) : " + isUnique(sc.next()));
            System.out.println("isUniqueChar(a) : " + isUniqueChar(sc.next()));
            // System.out.println(sc.hasNextInt() ? "(int) " + sc.nextInt()
            // : sc.hasNextLong() ? "(long) " + sc.nextLong()
            // : sc.hasNextDouble() ? "(double) " + sc.nextDouble()
            // : sc.hasNextBoolean() ? "(boolean) " + sc.nextBoolean() : "(String) " +
            // sc.next());
        }

    }
}
