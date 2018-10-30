package kyu8;

/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 *
 * The output should be two capital letters with a dot seperating them.
 *
 * It should look like this:
 *
 * Sam Harris => S.H
 *
 * Patrick Feeney => P.F
 * */

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] res = name.split(" ");

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        String str = "";
            str +=  res[0].substring(res[0].length() - 1 - (res[0].length()-1), res[0].length()- (res[0].length()-1)).toUpperCase();
            str += ".";
            str +=  res[1].substring(res[1].length() - 1 - (res[1].length()-1),  res[1].length()- (res[1].length()-1)).toUpperCase();
        return str;
    }

    public static void main(String[] args) {
        System.out.println( abbrevName("Sam Harris"));
    }
}
