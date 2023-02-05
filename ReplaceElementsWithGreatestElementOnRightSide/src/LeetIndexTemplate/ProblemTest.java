package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // single element
    public void singleElement() {
        int[] testArray = {1};
        int[] expected = {-1};
        int[] actual = Problem.replaceElements(testArray);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test // single element
    public void doubleElement() {
        int[] testArray = {1,36};
        int[] expected = {36,-1};
        int[] actual = Problem.replaceElements(testArray);
        assertTrue(Arrays.equals(expected, actual));
    }

        // typical cases

    @Test // basic test included with leet example
    public void basicLeetExample() {
        int[] testArray = {17,18,5,4,6,1};
        int[] expected = {18,6,6,6,1,-1};
        int[] actual = Problem.replaceElements(testArray);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test // complex typical case, greatest last
    public void typicalExampleGreatestLast() {
        int[] testArray = {1,91,2,82,3,73,4,64,5,101,6,102,7,103,8,104,9,105};
        int[] expected = {105,105,105,105,105,105,105,105,105,105,105,105,105,105,105,105,105,-1};
        int[] actual = Problem.replaceElements(testArray);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test // complex typical case, greatest middle
    public void typicalExampleGreatestMiddle() {
        int[] testArray = {1,91,2,82,3,73,4,64,5,107,6,102,7,103,8,104,9,105};
        int[] expected = {107,107,107,107,107,107,107,107,107,105,105,105,105,105,105,105,105,-1};
        int[] actual = Problem.replaceElements(testArray);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test // complex typical case, greatest middle
    public void typicalExampleGreatestFirst() {
        int[] testArray = {107,9,8,105,104,7,103,6,102,101,5,13,21,22,3,2};
        int[] expected = {105,105,105,104,103,103,102,102,101,22,22,22,22,3,2,-1};
        int[] actual = Problem.replaceElements(testArray);
        assertTrue(Arrays.equals(expected, actual));
    }
}