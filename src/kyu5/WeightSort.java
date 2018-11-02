package kyu5;

import java.util.*;

public class WeightSort {

    public static Integer summ(Integer element) {
        int res = 0;
        int temp = element;
        while (temp != 0) {
            res += temp % 10;
            temp /= 10;
        }
        return res;
    }

    public static void main(String[] args) {

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();


        Integer[] arr = {56, 65, 74, 100, 99, 68, 86, 180, 90};

        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> list = new ArrayList();
            for (int j = 0; j < arr.length; j++) {
                if (summ(arr[i]) == summ(arr[j])) {
                    list.add(arr[j]);

                }
            }
            map.put(summ(arr[i]), list);


        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

    }
}
