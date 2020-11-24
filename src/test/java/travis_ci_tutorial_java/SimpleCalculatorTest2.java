package travis_ci_tutorial_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest2 {
    // JUnit test for Add method
    @Test
    void testAdd()
    {
        assertEquals(15, SimpleCalculatorTest.Add(10, 5));
        
    }
}