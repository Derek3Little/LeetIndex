package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

        // greatestValueOfRow tests

    @Test // single element in row
    public void greatestValueOfRowSingleElement() {
        int[] testRow = {1};
        int expectedInt = 1;
        int actualInt = Problem.greatestValueOfRow(testRow);
        int[] expectedRow = {0};
        int[] actualRow = testRow;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedRow, actualRow); // confirming deletion
    }

    @Test // duplicate greatest
    public void greatestValueOfRowDupeGreatest() {
        int[] testRow = {1,3,5,11,9,11,7};
        int expectedInt = 11;
        int actualInt = Problem.greatestValueOfRow(testRow);
        int[] expectedRow = {1,3,5,0,9,11,7};
        int[] actualRow = testRow;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedRow, actualRow); // confirming deletion
    }

    @Test // first element greatest
    public void greatestValueOfRowFirst() {
        int[] testRow = {22,16,10,4,6,12,20};
        int expectedInt = 22;
        int actualInt = Problem.greatestValueOfRow(testRow);
        int[] expectedRow = {0,16,10,4,6,12,20};
        int[] actualRow = testRow;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedRow, actualRow); // confirming deletion
    }

    @Test // last element greatest
    public void greatestValueOfRowLast() {
        int[] testRow = {20,12,6,4,10,16,22};
        int expectedInt = 22;
        int actualInt = Problem.greatestValueOfRow(testRow);
        int[] expectedRow = {20,12,6,4,10,16,0};
        int[] actualRow = testRow;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedRow, actualRow); // confirming deletion
    }

    @Test // middle element greatest
    public void greatestValueOfRowMid() {
        int[] testRow = {1,2,3,4,5,6,7,8,9,8,7,6,5,3,4,2,1};
        int expectedInt = 9;
        int actualInt = Problem.greatestValueOfRow(testRow);
        int[] expectedRow = {1,2,3,4,5,6,7,8,0,8,7,6,5,3,4,2,1};
        int[] actualRow = testRow;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedRow, actualRow); // confirming deletion
    }


}