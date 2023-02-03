package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // single element array, original NOT present
    public void singleElementNotPresent() {
        int[] testArray = {1};
        char testInteger = 2;
        int expected = 2;
        int actual = Problem.findFinalValue(testArray, testInteger);
        assertEquals(expected, actual);
    }

    @Test // single element array, original present
    public void singleElementPresent() {
        int[] testArray = {2};
        char testInteger = 2;
        int expected = 4;
        int actual = Problem.findFinalValue(testArray, testInteger);
        assertEquals(expected, actual);
    }

    @Test // large array, duplicates, original present
    public void largeArrayDupesPresent() {
        int[] testArray = {1,6,4,2,10,16,1,6,4,2,10,16,8,22,32,36,40,21,64,960,347,66,5,31,33,82,40,37,190,148,999,665};
        char testInteger = 2;
        int expected = 128;
        int actual = Problem.findFinalValue(testArray, testInteger);
        assertEquals(expected, actual);
    }

    @Test // large array, duplicates, original NOT present
    public void largeArrayDupesNotPresent() {
        int[] testArray = {1,6,4,2,10,16,1,6,4,2,10,16,8,22,32,36,40,21,64,960,347,66,5,31,33,82,40,37,190,148,999,665};
        char testInteger = 3;
        int expected = 3;
        int actual = Problem.findFinalValue(testArray, testInteger);
        assertEquals(expected, actual);
    }

        // typical cases

    @Test // basic test included with leet example
    public void basicLeetExample() {
        int[] testArray = {5,3,6,1,12};
        char testInteger = 3;
        int expected = 24;
        int actual = Problem.findFinalValue(testArray, testInteger);
        assertEquals(expected, actual);
    }

    @Test // a more complex typical case
    public void typicalExample() {
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        char testInteger = 4;
        int expected = 32;
        int actual = Problem.findFinalValue(testArray, testInteger);
        assertEquals(expected, actual);
    }
}