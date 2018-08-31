package kyu5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static void mapFilling(String str, HashMap<Character, Integer> map) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }

    public static boolean scramble(String str1, String str2) {
        HashMap<Character, Integer> mapForStr1 = new HashMap<>();
        HashMap<Character, Integer> mapForStr2 = new HashMap<>();
        mapFilling(str1, mapForStr1);
        mapFilling(str2, mapForStr2);
        boolean result = false;
        String[] chars2 = new String[mapForStr2.size()];
        String chars1 = new String();
        for (Map.Entry<Character, Integer> entry : mapForStr1.entrySet()) {
            chars1 += entry.getKey();
        }
        int i = 0;
        for (Map.Entry<Character, Integer> entry : mapForStr2.entrySet()) {
            chars2[i] = entry.getKey().toString();
            i++;
        }

        int[] int1 = new int[mapForStr1.size()];
        int[] int2 = new int[mapForStr2.size()];
        int k = 0;
        for (Map.Entry<Character, Integer> entry : mapForStr1.entrySet()) {
            int1[k] = entry.getValue();
            k++;
        }
        k = 0;
        for (Map.Entry<Character, Integer> entry : mapForStr2.entrySet()) {
            int2[k] = entry.getValue();
            k++;
        }
        for (int j = 0; j < chars2.length; j++) {
            if (chars1.contains(chars2[j])) {
                if(Arrays.equals(int1, int2)){
                    result = true;
                }

            } else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
    }
}