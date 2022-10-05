package CodeAnalysier;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {
    private static Container container;

    @BeforeAll
    public static void setUp(){
        container = new Container();
    }

    @Test
    void contains() {
        container.add("Dupa", "typ dupny");
        assertEquals("typ dupny", container.contains("Dupa"));
        assertEquals(null, container.contains("dupa"));
    }
}