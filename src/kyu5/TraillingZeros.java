package kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//https://habr.com/ru/post/444112/
public class TraillingZeros {
    public static int zeros(int n) {

        int sum = 0;
        for (int i = 5; i <=n; i *= 5) {
            sum += n / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(zeros(14));
    }


    @Test
    public void testZeros() throws Exception {
        assertEquals(0, TraillingZeros.zeros(0));
        assertEquals(1, TraillingZeros.zeros(6));
        assertEquals(2, TraillingZeros.zeros(14));
    }
}
