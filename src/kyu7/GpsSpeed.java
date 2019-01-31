package kyu7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;

public class GpsSpeed {
    private static int gps(int s, double[] x) {
        System.out.println(s);
        DoubleStream.of(x).forEach(System.out::println);
        System.out.println(x.length);
        if (x.length > 1) {
            List<Double> list = new ArrayList<>();

            for (int i = 0; i < x.length - 1; i++) {
                list.add(x[i + 1] - x[i]);
            }
            double delta = list.stream().max(Comparator.comparing(Double::intValue)).get();
            Double res = ((3600 * delta) / s);
            return Math.abs(res.intValue());
        } else return 0;
    }

    public static void main(String[] args) {
        double[] x = new double[]{};
        System.out.println(gps(19, x ));
    }

}
