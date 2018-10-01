package kyu7;
/**
 *
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 *
 * */

public class Kata {
    public static int findShort(String s) {
        int max = s.length();
        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() < max) {
                max = strArr[i].length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(s));
    }
}
