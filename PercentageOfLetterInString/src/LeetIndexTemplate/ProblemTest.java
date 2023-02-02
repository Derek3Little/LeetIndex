package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // edge cases

    @Test // no letter present, 0 percent
    public void letterNotPresent() {
        String testString = "z";
        char testLetter = 'a';
        int expected = 0;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

    @Test // empty string
    public void emptyString() {
        String testString = "";
        char testLetter = 'q';
        int expected = 0;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

    @Test // only letter present, 100 percent
    public void onlyLetterPresent() {
        String testString = "zzz";
        char testLetter = 'z';
        int expected = 100;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

    @Test // returning rounded down percent, 1/6 = 0.166 -> 16
    public void roundingDown() {
        String testString = "aazaaa";
        char testLetter = 'z';
        int expected = 16;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

    @Test // 100 max string length by problem constraint, a = 10%
    public void oneHundred() {
        String testString = "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefgh" +
                "ijabcdefghij"; // length of 100, 'abcdefghij' repeated 10x
        char testLetter = 'a';
        int expected = 10;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

        // typical cases

    @Test // basic test included with leet example
    public void basicLeetExample() {
        String testString = "foobar";
        char testLetter = 'o';
        int expected = 33;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

    @Test // a more complex typical case
    public void typicalExample() {
        String testString = "deoxyribonucleic"; // real 16 character word
        char testLetter = 'c';
        int expected = 12;
        int actual = Problem.percentageLetter(testString, testLetter);
        assertEquals(expected, actual);
    }

}