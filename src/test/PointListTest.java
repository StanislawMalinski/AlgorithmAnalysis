import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointListTest {
    private static PointList list;

    @BeforeAll
    public static void setUp(){
        list = new PointList();
        Point point;
        for(int i = 0; i < 5; i++){
            point = new Point();
            point.x = i;
            point.y = i;
            list.addPoint(point);
        }
    }

    @Test
    public void Test(){
        Point point;
        for(int i = 0; i < 5; i++){
            point = new Point();
            point.x = i;
            point.y = i;
            assertEquals(point,list.getPoint(i));
        }
    }
}