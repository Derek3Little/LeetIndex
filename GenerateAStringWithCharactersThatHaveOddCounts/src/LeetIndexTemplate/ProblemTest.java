package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // shortest odd
    public void shortestOdd() {
        int testInt = 1;
        String expected = "q";
        String actual = Problem.generateTheString(testInt);
        assertEquals(expected, actual);
    }

    @Test // shortest even
    public void shortestEven() {
        int testInt = 2;
        String expected = "pq";
        String actual = Problem.generateTheString(testInt);
        assertEquals(expected, actual);
    }

    @Test // long odd
    public void longOdd() {
        int testInt = 99;
        String expected = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +
                "qqqqqqqqqq";
        String actual = Problem.generateTheString(testInt);
        assertEquals(expected, actual);
    }

    @Test // long even
    public void longEven() {
        int testInt = 98;
        String expected = "pqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +
                "qqqqqqqqq";
        String actual = Problem.generateTheString(testInt);
        assertEquals(expected, actual);
    }
    
}