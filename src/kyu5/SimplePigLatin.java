package kyu5;

import java.util.ArrayList;
import java.util.List;

public class SimplePigLatin {
    public static String pigIt(String str) {
        if(str.length()==0){
            return "";
        }
        String[] temp = str.split(" ");
        ArrayList<char[]> seq = new ArrayList<>();
        String result = new String();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            seq.add(temp[i].toCharArray());
        }

        for (int i = 0; i < seq.size(); i++) {
            char[] charArr = seq.get(i);
            String tempRes = "";
            tempRes += charArr[seq.size()-seq.size()+1];
            for (int j = 2; j < charArr.length; j++) {
                tempRes += charArr[j];
            }
            tempRes += charArr[0] + "ay ";
            list.add(tempRes);
        }
        for (String string : list) {
            result += string;
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }
}
