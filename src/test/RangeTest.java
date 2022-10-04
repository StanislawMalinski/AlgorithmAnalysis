import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    private static Range range;

    @BeforeAll
    public static void setUp(){
        range = new Range();
    }

    @Test
    public void testIterator(){
        Iterator<Integer> iter = range.Iterator();
        int step = 0;
        while (iter.hasNext()){
            assertEquals( (step++)*10, iter.next());
        }
    }
}