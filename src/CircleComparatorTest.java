import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] cir = new Circle[5];
        cir[0] = new Circle(3.6);
        cir[1] = new Circle();
        cir[2] = new Circle(3.5, "red", true);
        cir[3] = new Circle(3.5, "red", false);
        cir[4] = new Circle(3.5, "yellow", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : cir) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(cir, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : cir) {
            System.out.println(circle);
        }


    }
}
