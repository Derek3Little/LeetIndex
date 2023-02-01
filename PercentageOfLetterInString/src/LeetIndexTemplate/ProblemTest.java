package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // no letter present, zero percent
    public void letterNotPresent() {
        String testString = "z";
        char testLetter = 'a';
        int expected = 0;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

}