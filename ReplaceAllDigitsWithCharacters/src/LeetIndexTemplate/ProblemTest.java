package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // minimum input, no shift
    public void minimumInputNoShift() {
        String testString = "z";
        String expected = testString;
        String actual = Problem.replaceDigits(testString);
        assertEquals(expected, actual);
    }

    @Test // minimum input, shift
    public void minimumInputShift() {
        String testString = "q9";
        String expected = "qz";
        String actual = Problem.replaceDigits(testString);
        assertEquals(expected, actual);
    }


    @Test // large input
    public void largeInput() {
        String testString = "a1b2c3d4e5f6g7h8i9";
        String expected = "abbdcfdhejflgnhpir";
        String actual = Problem.replaceDigits(testString);
        assertEquals(expected, actual);
    }

}