package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // single element string, true by default
    public void singleElement() {
        String testInput = "a";
        assertTrue(Problem.areOccurrencesEqual(testInput));
    }

    @Test // two element string, true by default
    public void twoElement() {
        String testInput = "az";
        assertTrue(Problem.areOccurrencesEqual(testInput));
    }

    @Test // three element string, true
    public void threeElementTrue() {
        String testInput = "abc";
        assertTrue(Problem.areOccurrencesEqual(testInput));
    }

    @Test // three element string, false
    public void threeElementFalse() {
        String testInput = "abb";
        assertFalse(Problem.areOccurrencesEqual(testInput));
    }

    @Test // large input, true
    public void largeInputTrue() {
        String testInput = "aaabbbcccdddeeefffggghhhiiijjjkkklllmmmnnnooopppqqqrrrssstttuuuvvvwwwxxxyyyzzz";
        assertTrue(Problem.areOccurrencesEqual(testInput));
    }

    @Test // large input, true
    public void largeInputFalse() {
        String testInput = "aaabbbcccdddeeefffggghhhiiijjjkklllmmmnnnooopppqqqrrrssstttuuuvvvwwwxxxyyyzzz"; // -k
        assertFalse(Problem.areOccurrencesEqual(testInput));
    }


}