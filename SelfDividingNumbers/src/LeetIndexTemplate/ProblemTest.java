package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // selfDividify tests

    @Test // single digit, one
    public void selfDividifyOne() {
        int testInt = 1;
        assertTrue(Problem.selfDividify(testInt));
    }

    @Test // single digit, nine
    public void selfDividifyNine() {
        int testInt = 9;
        assertTrue(Problem.selfDividify(testInt));
    }

    @Test // double digits, pass
    public void selfDividifyDoublePass() {
        int testInt = 22;
        assertTrue(Problem.selfDividify(testInt));
    }

    @Test // double digits, fail
    public void selfDividifyDoubleFail() {
        int testInt = 13;
        assertTrue(!Problem.selfDividify(testInt)); // !
    }

    @Test // zero present, fail
    public void selfDividifyZeroFail() {
        int testInt = 10;
        assertTrue(!Problem.selfDividify(testInt)); // !
    }

    @Test // zero present in large input, fail
    public void selfDividifyZeroLargeFail() {
        int testInt = 2638041;
        assertTrue(!Problem.selfDividify(testInt)); // !
    }

    @Test // larger input, fail
    public void selfDividifyLargeFail() {
        int testInt = 2468;
        assertTrue(!Problem.selfDividify(testInt)); // !
    }

        // selfDividingNumbers tests

    @Test // single digit range
    public void selfDividingNumbersSingle() {
        int testLeft = 1;
        int testRight = 1;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = Problem.selfDividingNumbers(testLeft, testRight);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test // long range
    public void selfDividingNumbersLong() {
        int testLeft = 30;
        int testRight = 90;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(33); expected.add(36); expected.add(44); expected.add(48);
        expected.add(55); expected.add(66); expected.add(77); expected.add(88);
        List<Integer> actual = Problem.selfDividingNumbers(testLeft, testRight);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}