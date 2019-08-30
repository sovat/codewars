import java.math.BigInteger;
import java.util.Scanner;

public class Fibo {


    public static BigInteger fibo(BigInteger n) {
        BigInteger x = BigInteger.valueOf(1);
        BigInteger y = BigInteger.valueOf(0);
        for (int i = 0; i < n.abs().intValue(); i++) {
            x = x.add(y);
            y = x.subtract(y);
        }

        return (n.compareTo(BigInteger.valueOf(0)) < 0 && (n.intValue() % 2 == 0)) ? y.negate() : y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N ");
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Long start = System.nanoTime();
            System.out.println(fibo(BigInteger.valueOf(n)));
            Long finish = System.nanoTime();
            Long time = finish - start;
            System.out.println(time.doubleValue() / 1000000000 + " секунды");
        }
    }
}
