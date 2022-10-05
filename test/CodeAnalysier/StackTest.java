package CodeAnalysier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private static Stack stack;
    private static Container variableContainer;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
        variableContainer = new Container();
    }

    @Test
    public void isEmpty(){
        stack.put("MethodName", variableContainer);
        stack.put("MethodName1", new Container());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pop(){
        stack.put("MethodName", variableContainer);
        stack.put("MethodName1", new Container());
        stack.pop();
        assertEquals("MethodName",stack.getTopName());
        assertEquals(variableContainer ,stack.getTopContainer());
    }

    @Test
    public void top(){
        stack.put("MethodName1", new Container());
        stack.put("MethodName", variableContainer);

        assertEquals("MethodName",stack.getTopName());
        assertEquals(variableContainer ,stack.getTopContainer());
    }
}