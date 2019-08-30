package kyu8;


import java.util.Arrays;

/**
 * https://www.codewars.com/kata/how-good-are-you-really/train/java
 * <p>
 * There was a test in your class and you passed it. Congratulations!
 * But you're an ambitious person. You want to know if you're better than the average student in your class.
 * <p>
 * You receive an array with your peers' test scores. Now calculate the average and compare your score!
 * <p>
 * Return True if you're better, else False!
 * <p>
 * Note:
 * Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!
 */
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }

    public static void main(String[] args) {
        System.out.println(  betterThanAverage(new int[] {100, 90}, 75));
    }
}
