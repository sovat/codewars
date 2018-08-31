package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Task:
In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules:
 	1.  The input string will always be lower case but maybe empty.

2.  If the character in the string is whitespace then pass over it as if it was an empty seat.
* */

public class MexicanWave {

    public static String[] wave(String str) {
        String[] result = new String[str.length()];
        char[] temp = str.toCharArray();
        if (!(str.startsWith(" ") || str.endsWith(" "))) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != ' ') {
                    temp[i] = Character.toUpperCase(temp[i]);
                    result[i] = String.valueOf(temp);
                    temp[i] = Character.toLowerCase(temp[i]);
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {

            if (temp[i] != ' ') {
                temp[i] = Character.toUpperCase(temp[i]);
                result[i] = String.valueOf(temp);
                temp[i] = Character.toLowerCase(temp[i]);
            }
        }

        List<String> list = new ArrayList<String>();
        for (String s : result) {
            if (s != null && s.length() > 0) {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.asList(wave(" fkbb jjv glaclt")));
    }

}
