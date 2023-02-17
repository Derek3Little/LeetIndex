package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    public void singleFive() {
        int[] testBills = {5};
        assertTrue(Problem.lemonadeChange(testBills));
    }

    @Test
    public void singleTen() {
        int[] testBills = {10};
        assertFalse(Problem.lemonadeChange(testBills));
    }

    @Test
    public void singleTwenty() {
        int[] testBills = {20};
        assertFalse(Problem.lemonadeChange(testBills));
    }

    @Test
    public void leadingTen() {
        int[] testBills = {10,5,5,5,5,5,20};
        assertFalse(Problem.lemonadeChange(testBills));
    }

    @Test
    public void leadingTwenty() {
        int[] testBills = {20,5,5,5,5,5,10};
        assertFalse(Problem.lemonadeChange(testBills));
    }

    @Test
    public void endAtZeroTwenty() {
        int[] testBills = {5,10,5,20};
        assertTrue(Problem.lemonadeChange(testBills));
    }

    @Test
    public void endAtNegativeTwenty() {
        int[] testBills = {5,10,20};
        assertFalse(Problem.lemonadeChange(testBills));
    }
}