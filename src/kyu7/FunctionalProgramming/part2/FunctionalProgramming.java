package kyu7.FunctionalProgramming.part2;


import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {

    public static ToDoubleFunction<Triangle> f = (x) -> {
        x.setArea(0.5 * x.base * x.height);
        return x.getArea();
    };

    public static void main(String[] args) {
        Triangle t = new Triangle(5, 10);
        System.out.println(f.applyAsDouble(t));
    }
}
