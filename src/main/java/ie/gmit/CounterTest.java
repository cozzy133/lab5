package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class CounterTest {

    private Counter myCounter;
    @BeforeAll
    public static void print(){
        System.out.println("Starting\n" +
                "tests");
    }

    @BeforeEach
    void init()
    {
        myCounter = new Counter();
    }

    @Test
    void testConstructor()
    {
        assertEquals(0, myCounter.getCount());
    }

    @Test
    void testIncrement()
    {
        assertEquals(1, myCounter.increment());
    }

    @Test
    void testDecrement()
    {
        assertEquals(-1, myCounter.decrement());
    }

    @AfterAll
    public static void done(){
        System.out.println("“Testing\n" +
                "Complete");
    }
}
