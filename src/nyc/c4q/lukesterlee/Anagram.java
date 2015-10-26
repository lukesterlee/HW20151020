package nyc.c4q.lukesterlee;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Luke Lee on 10/26/15.
 */
public class Anagram {

    public static boolean isAnagram(String a, String b) {
        a = a.trim().toLowerCase();
        b = b.trim().toLowerCase();

        if (a.length() != b.length())
            return false;

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != b1[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(isAnagram("eleven plus two", "twelve plus one"));
        System.out.println(isAnagram("nike", "nake"));
        System.out.println(isAnagram("abcd", "bcda"));
    }
}
