import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        String[] result = new String[str.length()];
        char[] temp = str.toCharArray();
        if (!(str.indexOf(0) == ' ' || str.indexOf(temp.length) == ' ')) {
            for (int i = 0; i < temp.length; i++) {

                if (temp[i] == ' ') {

                    i++;
                }
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
        System.out.println(Arrays.asList(wave(" gap ")));
    }

}
