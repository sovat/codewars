import java.io.File;
import java.io.InputStream;
import java.io.Writer;

public class RandomString {


    private static String randomSprName = "";

    private static String getRandomSprName() {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randString = new StringBuilder();
        int min = 3;
        int max = 5;
        int tmp = max - min;
        int count = (int) (Math.random() * ++tmp) + min;
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        return randString.toString();
    }

    public static void main(String[] args) {
        randomSprName = getRandomSprName();
        System.out.println("ref" + randomSprName);
        System.out.println(File.separator);



    }

}
