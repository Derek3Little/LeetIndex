package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // minimum input
    public void minimumInput() {
        String testString = "aab"; // true
        assertTrue(Problem.equalFrequency(testString));
    }

}