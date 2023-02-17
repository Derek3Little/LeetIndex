package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    public void singleFive() {
        int[] testBills = {5};
        boolean expected = true;
        boolean actual = Problem.lemonadeChange(testBills);
        assertEquals(expected, actual);
    }

}