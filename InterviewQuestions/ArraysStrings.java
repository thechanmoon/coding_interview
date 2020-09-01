import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysStrings {

    static ArrayList<String> merge(final String[] words, final String[] more) {
        final ArrayList<String> sentence = new ArrayList<String>();
        for (final String w : words)
            sentence.add(w);
        for (final String w : more)
            sentence.add(w);
        return sentence;
    }

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

    static boolean isUniqueChar(final String str) {
        final int ARRAY_LENGTH = 128;

        if (str.length() > ARRAY_LENGTH)
            return false;

        final boolean[] bAsciiTable = new boolean[ARRAY_LENGTH];
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

    // 1.2 Check Permutation: Given two strings, write a method to decide if one is
    // a permutation of the other.
    // static boolean isPermutation(final String strA, final String strB)
    // {
    // if(strA.length() != strB.length())
    // return false;

    // final Char[] strArrayA = strA.to

    // return true;
    // }

    public static void main(final String[] args) {

        // merge
        // String[] words = { "I", "Love", "You", "!!" };
        // System.out.println(merge(words, words));

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

        // Scanner sc = new Scanner(System.in);
        // while (!sc.hasNext("exit")) {
        // // System.out.println("isUnique(a) : " + isUnique(sc.next()));
        // System.out.println("isUniqueChar(a) : " + isUniqueChar(sc.next()));
        // // System.out.println(sc.hasNextInt() ? "(int) " + sc.nextInt()
        // // : sc.hasNextLong() ? "(long) " + sc.nextLong()
        // // : sc.hasNextDouble() ? "(double) " + sc.nextDouble()
        // // : sc.hasNextBoolean() ? "(boolean) " + sc.nextBoolean() : "(String) " +
        // // sc.next());
        // }

    }
}
