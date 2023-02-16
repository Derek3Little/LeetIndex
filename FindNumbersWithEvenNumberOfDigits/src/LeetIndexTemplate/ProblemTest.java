package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    public void findDigitCountOne()  {
        int testInt = 1;
        int expected = 1;
        int actual = Problem.findDigitCount(testInt);
        assertEquals(expected, actual);
    }

    @Test
    public void findDigitCountTwo()  {
        int testInt = 13;
        int expected = 2;
        int actual = Problem.findDigitCount(testInt);
        assertEquals(expected, actual);
    }

    @Test // ten digits int maximum
    public void findDigitCountTen()  {
        int testInt = 1329475860;
        int expected = 10;
        int actual = Problem.findDigitCount(testInt);
        assertEquals(expected, actual);
    }

}