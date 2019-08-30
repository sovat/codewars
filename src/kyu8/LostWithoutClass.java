package kyu8;

import java.util.Arrays;
import java.util.stream.Stream;

public class LostWithoutClass {

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    public static void main(String[] args) {

    }
}
