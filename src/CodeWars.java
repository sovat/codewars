
public class CodeWars {
    public static String fakeBin(String numberString) {
        String res = new String();
        for (int i = 0; i < numberString.length(); i++) {
            res = (numberString.charAt(i) < 1) ? numberString.replace(numberString.charAt(i), '0') : numberString.replace(numberString.charAt(i), '1');
        }
        return res;

    }
}