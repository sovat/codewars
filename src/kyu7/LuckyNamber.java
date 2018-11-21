package kyu7;

/**
 * ###Lucky number
 * <p>
 * Write a function to find if a number is lucky or not. If the sum of all digits is 0 or multiple of 9 then the number is lucky.
 * <p>
 * 1892376 => 1+8+9+2+3+7+6 = 36. 36 is divisble by 9, hence number is lucky.
 * <p>
 * Function will return true for lucky numbers and false for others.
 */

public class LuckyNamber {
    public static boolean isLucky(long n) {
        int count = 0;
        while (n > 0) {
            count += n % 10;
            n = n / 10;
        }
        return (count == 0) || (count % 9 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLucky(0));
    }

}
