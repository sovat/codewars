package kyu6;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean check(String sentence) {

        String res = sentence.replaceAll("[^a-zA-z]", "").toLowerCase();
        System.out.println(res);
        char[] chars = res.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < chars.length; i++){
            set.add(chars[i]);

        }
        System.out.println(set.size());
        return set.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(check("Cwm fjord bank glyphs vext quiz\n" +
                "Pack my box with five dozen liquor jugs.\n" +
                "How quickly daft jumping zebras vex.\n" +
                "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ"));
    }
}
