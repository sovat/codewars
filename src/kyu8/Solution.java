package kyu8;
/**
 * http://www.codewars.com/kata/string-repeat/train/java
 *
 * */

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(repeatStr(6, "Hello"));
    }
}
