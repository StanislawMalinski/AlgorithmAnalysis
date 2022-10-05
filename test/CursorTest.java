import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CodeAnalysier.Cursor;

import static org.junit.jupiter.api.Assertions.*;

public class CursorTest {
    private static Cursor cursor;

    @BeforeEach
    public void setUp(){
        cursor = new Cursor("abc");
    }

    @Test
    public void getNextChar() {
        assertEquals('b', cursor.getNextChar());
    }

    @Test
    public void getPreviousChar() {
        cursor.getNextChar();
        assertEquals('a', cursor.getPreviousChar());
    }

    @Test
    public void getCurrentChar() {
        assertEquals('a', cursor.getCurrentChar());
    }

    @Test
    public void hasNext() {
        assertTrue(cursor.hasNext());
        cursor.getNextChar();
        cursor.getNextChar();
        assertFalse(cursor.hasNext());
    }

    @Test
    public void hasPrevious() {
        assertFalse(cursor.hasPrevious());
    }
}