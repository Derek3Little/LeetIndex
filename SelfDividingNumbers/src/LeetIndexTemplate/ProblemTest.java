package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

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
}