package kyu5;

import java.util.*;
import java.util.stream.Collectors;

public class WeightSort {

    public static Long summ(String element) {

        long res = 0;
        long temp = Long.valueOf(element);
        while (temp != 0) {
            res += temp % 10;
            temp /= 10;
        }
        return res;
    }

    public static String orderWeight(String strng) {

        if (strng.isEmpty() || strng.length() == 1){
            return strng;
        }

        String[] strings = strng.split(" ");
        TreeMap<Long, List<String>> map = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            List<String> list = new ArrayList();
            for (int j = 0; j < strings.length; j++) {
                if (summ(strings[i]) == summ(strings[j])) {
                    list.add(strings[j]);
                }
            }
            list = list.stream().sorted().collect(Collectors.toList());
            map.put(summ(strings[i]), list);
        }
        String str = "";
        for (Map.Entry entry : map.entrySet()) {

            str += entry.getValue().toString();
        }
        return str.replaceAll("[\\W]", " ").replaceAll("  "," " ).trim();
    }


    public static void main(String[] args) {

        System.out.println(orderWeight("59544965313"));
    }
}
