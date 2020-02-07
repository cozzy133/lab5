package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class CounterTest {

    private Counter myCounter;
    @BeforeAll
    @DisplayName("Starting tests")
    public static void print(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    @DisplayName("New instance of counter")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myCounter = new Counter();
        System.out.println("timestamp = " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Constructor test")
    void testConstructor(TestInfo testInfo)
    {
        assertEquals(0, myCounter.getCount());
    }

    @Test
    @DisplayName("Increment test")
    void testIncrement(TestInfo testInfo)
    {
        assertEquals(1, myCounter.increment());
    }

    @Test
    @DisplayName("Decrement test")
    void testDecrement(TestInfo testInfo)
    {
        assertEquals(-1, myCounter.decrement());
    }

    @AfterAll
    @DisplayName("Testing complete")
    public static void done(){
        System.out.println("Testing Complete");
    }
}
