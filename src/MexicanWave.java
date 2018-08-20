import java.util.Arrays;

public class MexicanWave {

    public static String[] wave(String str) {


        int spacePosition = str.indexOf(" ");
        String replacement = new String(str.replaceAll(" ", ""));
        String[] result = new String[replacement.length()];
        char[] temp = replacement.toCharArray();
        for (int i = 0; i < replacement.length(); i++) {
            temp[i] = Character.toUpperCase(temp[i]);
            result[i] = String.valueOf(temp);
            temp[i] = Character.toLowerCase(temp[i]);
        }


        StringBuilder dest;
        for (int i = 0; i < result.length; i++) {
            dest = new StringBuilder(result[i]);
            dest.insert(spacePosition, " ");
            result[i] = dest.toString();
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.asList(wave(" gap ")));
    }

}
