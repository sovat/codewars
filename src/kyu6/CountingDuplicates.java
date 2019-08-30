package kyu6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] chars = text.toUpperCase().toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char aChar : chars) {
            arrayList.add(aChar);
        }
        return  arrayList.stream().filter(o -> Collections.frequency(arrayList, o) > 1).collect(Collectors.toSet()).size();
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdeaB"));
    }
}
