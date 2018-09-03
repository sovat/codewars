package kyu6;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * <p>
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */

import java.util.ArrayList;


public class MultiplesThreeOrFive {

    public static boolean multiplesThree(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        if (sum % 3 == 0) return true;
        return false;
    }

    public static boolean multiplesFive(int number) {
        String num = String.valueOf(number);
        if (num.charAt(num.length()-1) == '0' || num.charAt(num.length()-1) == '5')
            return true;
        return false;
    }

    public static int solution(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < number; i++) {
            if (multiplesThree(i) || multiplesFive(i)) {
                result += i;
            }
        }
        System.out.println(number);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(20));
    }
}