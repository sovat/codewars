import static java.lang.System.out;

public class AllocatorTest {

    private int x;
    private int y;

    private AllocatorTest() {
    }

    private static void divide(int value, int divisor, AllocatorTest outResult) {
        outResult.x = value / divisor;
        outResult.y = value % divisor;

    }

    @Override
    public String toString() {
        return "AllocatorTest{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    public static void main(String[] args) {
        AllocatorTest result = new AllocatorTest();
        divide(5, 2, result);
        out.println(result.toString());

    }
}
