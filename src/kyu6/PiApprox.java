package kyu6;

import java.math.BigDecimal;

public class PiApprox {
    // PI = 4 - 4/3 + 4/5 - 4/7 + ...
    public static String iterPi2String(Double epsilon) {
        int n = 1;
        double pi = 4.;
        double factor = -4.;
        while (Math.abs(Math.PI - pi) > epsilon) {
            pi += factor / (n * 2 + 1);
            n++;
            factor = -factor;
        }
        return new String("["  + n + ", " + BigDecimal.valueOf(pi).setScale(10, BigDecimal.ROUND_HALF_UP) + "]");
    }

    public static void main(String[] args) {
        System.out.println(iterPi2String(0.1));
        System.out.println(Integer.parseInt("1"));
    }

}
