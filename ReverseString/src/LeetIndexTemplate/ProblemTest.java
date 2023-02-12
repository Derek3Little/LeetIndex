package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // one element in array
    public void singleElement() {
        char[] actual = {'z'};
        char[] expected = {'z'};
        Problem.reverseString(actual);
        assertArrayEquals(expected, actual);
    }

    @Test // two elements in array
    public void dualElement() {
        char[] actual = {'z','a'};
        char[] expected = {'a','z'};
        Problem.reverseString(actual);
        assertArrayEquals(expected, actual);
    }

    @Test // longest known palindrome
    public void oddElements() {
        char[] actual = {'t','a','t','t','a','r','r','a','t','t','a','t'};
        char[] expected = {'t','a','t','t','a','r','r','a','t','t','a','t'};
        Problem.reverseString(actual);
        assertArrayEquals(expected, actual);
    }

    @Test // basic example included with Leet problem, satisfies odd element count
    public void basicLeetExample() {
        char[] actual = {'h','e','l','l','o'};
        char[] expected = {'o','l','l','e','h'};
        Problem.reverseString(actual);
        assertArrayEquals(expected, actual);
    }

}