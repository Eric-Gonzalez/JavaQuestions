package com.cci;


import java.util.Arrays;

public class StringPermutation {

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] sortedS1 = s1.toCharArray();
        char[] sortedS2 = s2.toCharArray();

        Arrays.sort(sortedS1);
        Arrays.sort(sortedS2);

        return Arrays.equals(sortedS1, sortedS2);
    }
}
