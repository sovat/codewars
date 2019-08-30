package kyu6;

import java.util.concurrent.ThreadLocalRandom;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}\\-\\d{4}$");
    }

    public static void main(String[] args) {
        String phone = "(123) 456-7890";
        System.out.println(ThreadLocalRandom.current().nextInt(1, 24));
        System.out.println(validPhoneNumber(phone));

        int[] arr = ThreadLocalRandom.current().ints(12, -15, 15).toArray();

        for (int i = 0; i < arr.length + 5; i++) {
            System.out.println("foo " + arr[i]);
        }
    }
}
