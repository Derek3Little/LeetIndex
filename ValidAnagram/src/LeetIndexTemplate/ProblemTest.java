package LeetIndexTemplate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Objects;

class ProblemTest {

            // hashMapify tests

        // edge cases

    @Test // single letter word
    public void hashMapifySingleLetter() {
        String testString = "a";
        HashMap<Character, Integer> expected = new HashMap<Character, Integer>();
        expected.put('a', 1);
        HashMap<Character, Integer> actual = Problem.hashMapify(testString);
        assertTrue(Objects.equals(expected, actual));
    }

    @Test // word all same letter
    public void hashMapifyAllSameLetter() {
        String testString = "aaaa";
        HashMap<Character, Integer> expected = new HashMap<Character, Integer>();
        expected.put('a', 4);
        HashMap<Character, Integer> actual = Problem.hashMapify(testString);
        assertTrue(Objects.equals(expected, actual));
    }

        // typical cases

    @Test // real word
    public void hashMapifyTypicalCase() {
        String testString = "perpendicular";
        HashMap<Character, Integer> expected = new HashMap<Character, Integer>();
        expected.put('p', 2); expected.put('e', 2); expected.put('r', 2); expected.put('n', 1); expected.put('d', 1);
        expected.put('i', 1); expected.put('c', 1); expected.put('u', 1); expected.put('l', 1); expected.put('a', 1);
        HashMap<Character, Integer> actual = Problem.hashMapify(testString);
        assertTrue(Objects.equals(expected, actual));
    }

            // isAnagram tests

        // edge cases

    @Test // single letter words valid
    public void isAnagramSingleLettersValid() {
        String testStringS = "a";
        String testStringT = "a";
        assertTrue(Problem.isAnagram(testStringS, testStringT));
    }

    @Test // single letter words INvalid
    public void isAnagramSingleLettersInValid() {
        String testStringS = "a";
        String testStringT = "b";
        assertFalse(Problem.isAnagram(testStringS, testStringT));
    }

    @Test // different length words
    public void isAnagramDiffLength() {
        String testStringS = "car";
        String testStringT = "cars";
        assertFalse(Problem.isAnagram(testStringS, testStringT));
    }

        // typical cases

    @Test // basic test included with leet example
    public void basicLeetExample() {
        String testStringS = "anagram";
        String testStringT = "nagaram";
        assertTrue(Problem.isAnagram(testStringS, testStringT));
    }

    @Test // a more complex typical case, longest single-word anagrams!
    public void isAnagramLongestKnown() {
        String testStringS = "basiparachromatin";
        String testStringT = "marsipobranchiata";
        assertTrue(Problem.isAnagram(testStringS, testStringT));
    }

}