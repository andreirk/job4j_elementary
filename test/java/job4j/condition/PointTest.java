package java.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point point1 = new Point(5, 3);
        Point point2 = new Point(2, 334);

        double out = (double) point1.distance(point2);
        double expected = 10;

        assertEquals(out, expected, 0.1);


    }
    @Test
    public void distance3d() {
        Point point1 = new Point(5, 3, 45);
        Point point2 = new Point(2, 334, 12);
        Point point3 = new Point(22, 34, 2);


        double out = (double) point1.distance3d(point2, point3);
        double expected = 330.94;

        assertEquals(out, expected, 0.1);


    }
}