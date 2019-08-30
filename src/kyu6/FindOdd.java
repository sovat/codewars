package kyu6;

import java.util.*;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : a) {
            map.merge(i, 1, Integer::sum);
        }
        return Objects.requireNonNull(map.entrySet().stream().filter(entry -> entry.getValue() % 2 != 0).findFirst().orElse(null)).getKey();
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
    }
}
