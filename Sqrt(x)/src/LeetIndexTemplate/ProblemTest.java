package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // zero
    public void zero() {
        int testInt = 0;
        int expected = 0;
        int actual = Problem.mySqrt(testInt);
        assertEquals(expected, actual);
    }

    @Test // one
    public void one() {
        int testInt = 1;
        int expected = 1;
        int actual = Problem.mySqrt(testInt);
        assertEquals(expected, actual);
    }

    @Test // casting long to collect maximum 2^31 input constraint
    public void longInt() {
        long testLong = 2147483647L;
        int expected = 46340;
        int longCast = (int) testLong;
        int actual = Problem.mySqrt(longCast);
        assertEquals(expected, actual);
    }

    @Test // confirming the rounding down of int cast
    public void roundingDownIntCast() {
        int testInt = 60; // == 7.75
        int expected = 7; // should round down to 7
        int actual = Problem.mySqrt(testInt);
        assertEquals(expected, actual);
    }

            // typical cases

    @Test // basic test included with leet example
    public void basicLeetExample() {
        int testInt = 4;
        int expected = 2;
        int actual = Problem.mySqrt(testInt);
        assertEquals(expected, actual);
    }

    @Test // a more complex typical case
    public void typicalExample() {
        int testInt = 159201;
        int expected = 399;
        int actual = Problem.mySqrt(testInt);
        assertEquals(expected, actual);
    }

    @Test // maximum int size
    public void intMax() {
        int testInt = 1111111111;
        int expected = 33333;
        int actual = Problem.mySqrt(testInt);
        assertEquals(expected, actual);
    }

}