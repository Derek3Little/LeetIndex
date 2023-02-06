package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // minimum length string
    public void minimumLength() {
        String testString = "RL";
        int actual = 1;
        int expected = Problem.balancedStringSplit(testString);
        assertEquals(expected, actual);
    }

}