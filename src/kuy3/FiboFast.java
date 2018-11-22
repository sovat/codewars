package kuy3;

import java.math.BigInteger;

/**
 * Использование матричной формулы
 *          (0 1)n
 * (F0 F1)* (1 1) = (Fn Fn+1)
 * Для возведения матрицы в n-ую степень используется биномиальное возведение в степень
 */

public class FiboFast {

    public static BigInteger[][] matrixMultiplication(BigInteger[][] a, BigInteger[][] b) {
        return new BigInteger[][]{
                {a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])), a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]))},
                {a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])), a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]))},
        };
    }

    public static BigInteger[][] matrixPowerFast(BigInteger[][] a, int n) {
        if (n == 0) {
            return new BigInteger[][]{
                    {BigInteger.ONE, BigInteger.ZERO},
                    {BigInteger.ZERO, BigInteger.ONE}
            };
        } else if (n % 2 == 0) {
            return matrixPowerFast(matrixMultiplication(a, a), n / 2);
        } else {
            return matrixMultiplication(matrixPowerFast(a, n - 1), a);
        }
    }


    public static BigInteger fibonacci(BigInteger n) {
        if (n.intValue() == 0) {
            return BigInteger.ZERO;
        }
        BigInteger[][] a = {
                {BigInteger.ONE, BigInteger.ONE},
                {BigInteger.ONE, BigInteger.ZERO}
        };
        BigInteger[][] powerOfA = matrixPowerFast(a, n.abs().intValue() - 1);
        BigInteger nthFibonacci = powerOfA[0][0];
        return (n.compareTo(BigInteger.valueOf(0)) < 0 && (n.intValue() % 2 == 0)) ? nthFibonacci.negate() : nthFibonacci;
    }


    public static void main(String[] args) {

        System.out.println(fibonacci(BigInteger.valueOf(200000)));

    }

}
