package kyu7;

public class NegativeZeroValidation {
    public static boolean isNegativeZero(float n) {
        if (Float.floatToIntBits(n) == 0x80000000) {
            return true;
        } else return false;

    }

    public static void main(String[] args) {
        System.out.println(isNegativeZero(-5f));
    }
}
