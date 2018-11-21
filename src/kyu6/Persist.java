package kyu6;

public class Persist {

    public static int  digitMultiply(long n){
        int count = 1;
        while (n > 0) {
            count *= n % 10;
            n = n / 10;
        }
        return count;
    }

    public static int persistence(long n) {
        int count = 0;
        while (String.valueOf(n).length()!=1){
           n = digitMultiply(n);
           count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }
}
