package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // minimum input both same character
    public void minimumInputSame() {
        String testString = "aa"; // true
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // minimum input diff characters
    public void minimumInputDiff() {
        String testString = "ab"; // true
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // almost minimum TRUE
    public void almostMinimumInputT() {
        String testString = "aab"; // true
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // all distinct characters with count of 1, any can be removed!
    public void allDistinctT() {
        String testString = "abc";
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // minimum input
    public void removeSingletonToEqualize() {
        String testString = "abbccdd"; // true
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // typical input TRUE
    public void typicalInputT() {
        String testString = "aabbccc";
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // typical input FALSE
    public void typicalInputF() {
        String testString = "aabbccdd"; // false
        assertTrue(!Problem.equalFrequency(testString)); // !
    }

    @Test // huge crazy input TRUE
    public void largeInputT() {
        String testString = "qwertyuiopqwertyuioppqwertyuiopqwertyuiop"; // note extra p in middle
        assertTrue(Problem.equalFrequency(testString));
    }

    @Test // huge crazy input FALSE
    public void largeInputF() {
        String testString = "zxcvbnmzxcvbnmzxcvbnmzxcvbnmzxcvbnmzxcvbnmzxcvbnm"; // all equal == false
        assertTrue(!Problem.equalFrequency(testString)); // !
    }
}