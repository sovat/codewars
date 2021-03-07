package kuy4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NextBiggerNumber {

    private static Long[] splitIntoDigits(long n) {
        List<Long> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        Collections.reverse(digits);
        return digits.toArray(new Long[digits.size()]);
    }


    private static Long arrToLong(Long[] arr) {
        StringBuilder sb = new StringBuilder();
        for (Long digit : arr) {
            sb.append(digit);
        }
        return Long.parseLong(sb.toString());
    }


    public static long nextBiggerNumber(long n) {


        Long[] array = splitIntoDigits(n);

        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) {
           return -1;
        }

        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        long temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return arrToLong(array);
    }

    public static void main(String[] args) {
        long n = 9876543210L;
        System.out.println(nextBiggerNumber(n));
    }

    @Test
    public void basicTests() {
        assertEquals(21, NextBiggerNumber.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumber.nextBiggerNumber(144));
        assertEquals(19009, NextBiggerNumber.nextBiggerNumber(10990));

    }
}
