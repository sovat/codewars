package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * John has invited some friends. His list is:
 * <p>
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 * Could you make a program that
 * <p>
 * makes this string uppercase
 * gives it sorted in alphabetical order by last name.
 * When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.
 * <p>
 * So the result of function meeting(s) will be:
 * <p>
 * "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
 * It can happen that in two distinct families with the same family name two people have the same first name too.
 * <p>
 * Notes
 * You can see another examples in the "Sample tests".
 */

public class Meeting {

    public static void main(String[] args) {

        meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn");
//(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)
    }

    public static String meeting(String s) {
        List<List<String>> fullnames = new ArrayList();

        String[] split = s.toUpperCase().split(";");
        for (String s1 : split) {
            fullnames.add(Arrays.asList(s1.split(":")));
        }
        for (List<String> fullname : fullnames) {
            fullname.forEach(System.out::println);
        }
        return fullnames.toString();
    }

}
