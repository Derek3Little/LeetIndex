package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // minimum length string
    public void minimumLength() {
        String testString = "RL";
        int expected = 1;
        int actual = Problem.balancedStringSplit(testString);
        assertEquals(expected, actual);
    }

    @Test // single split
    public void singleSplit() {
        String testString = "RRRRRRRLLLLLLL";
        int expected = 1;
        int actual = Problem.balancedStringSplit(testString);
        assertEquals(expected, actual);
    }

        // typical cases

    @Test // basic test included with leet example
    public void basicLeetExample() {
        String testString = "RLRRLLRLRL";
        int expected = 4;
        int actual = Problem.balancedStringSplit(testString);
        assertEquals(expected, actual);
    }

    @Test // a more complex case
    public void typicalLargeString() {
        String testString = "RRLLRLRRRLLLRLRRRRLLLLRLRL";
        int expected = 7;
        int actual = Problem.balancedStringSplit(testString);
        assertEquals(expected, actual);
    }
}