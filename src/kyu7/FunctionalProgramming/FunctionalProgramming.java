package kyu7.FunctionalProgramming;

import java.util.function.Function;

public class FunctionalProgramming {
    public static Function<Student, Boolean> f = x ->
            (x.studentNumber.equals("js123") && x.getFullName().equals("John Smith"));


    public static void main(String[] args) {
        Student jSmith = new Student("John", "Smith", "js123");
        System.out.println(f.apply(jSmith));
    }
}
