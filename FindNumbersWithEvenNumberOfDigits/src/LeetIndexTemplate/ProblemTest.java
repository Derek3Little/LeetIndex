package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // findDigitCount tests

    @Test // single digit
    public void findDigitCountOne()  {
        int testInt = 1;
        int expected = 1;
        int actual = Problem.findDigitCount(testInt);
        assertEquals(expected, actual);
    }

    @Test // two digits
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

        // findNumbers tests

    @Test // single element array, zero evens
    public void findNumbersSingleZero()  {
        int[] testArray = {1};
        int expected = 0;
        int actual = Problem.findNumbers(testArray);
        assertEquals(expected, actual);
    }

    @Test // single element array, zero evens
    public void findNumbersSingleOne()  {
        int[] testArray = {11};
        int expected = 1;
        int actual = Problem.findNumbers(testArray);
        assertEquals(expected, actual);
    }

    @Test // large array, zero evens
    public void findNumbersLargeInputZero()  {
        int[] testArray = {1,123,345,56789,234,135,35764,90192};
        int expected = 0;
        int actual = Problem.findNumbers(testArray);
        assertEquals(expected, actual);
    }

    @Test // large array, one even
    public void findNumbersLargeInputOne()  {
        int[] testArray = {1,123,345,56789,2134,135,35764,90192}; // 2134
        int expected = 1;
        int actual = Problem.findNumbers(testArray);
        assertEquals(expected, actual);
    }

    @Test // large array, all evens
    public void findNumbersLargeInputAll()  {
        int[] testArray = {13,1233,3345,567389,2334,1335,353764,904192};
        int expected = 8;
        int actual = Problem.findNumbers(testArray);
        assertEquals(expected, actual);
    }
}