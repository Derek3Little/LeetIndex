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

        // greatestValueOfGrid tests

    @Test // single element in single row grid
    public void greatestValueOfGridOneElementOneRow() {
        int[][] testGrid = {{1}};
        int expectedInt = 1;
        int actualInt = Problem.greatestValueOfGrid(testGrid);
        int[][] expectedGrid = {{0}};
        int[][] actualGrid = testGrid;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedGrid, actualGrid); // confirming deletion
    }

    @Test // single element rows in grid
    public void greatestValueOfGridOneElementMultipleRows() {
        int[][] testGrid = {{1},{7},{11}};
        int expectedInt = 11;
        int actualInt = Problem.greatestValueOfGrid(testGrid);
        int[][] expectedGrid = {{0},{0},{0}};
        int[][] actualGrid = testGrid;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedGrid, actualGrid); // confirming deletion
    }

    @Test // duplicate greatest
    public void greatestValueOfGridDupeGreatest() {
        int[][] testGrid = {{1,6,9},{2,3,9},{9,8,4}};
        int expectedInt = 9;
        int actualInt = Problem.greatestValueOfGrid(testGrid);
        int[][] expectedGrid = {{1,6,0},{2,3,0},{0,8,4}};
        int[][] actualGrid = testGrid;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedGrid, actualGrid); // confirming deletion
    }

    @Test // greatest first
    public void greatestValueOfGridFirst() {
        int[][] testGrid = {{21,18,20,13,10},{20,13,6,1,2},{19,16,13,10,7}};
        int expectedInt = 21;
        int actualInt = Problem.greatestValueOfGrid(testGrid);
        int[][] expectedGrid = {{0,18,20,13,10},{0,13,6,1,2},{0,16,13,10,7}};
        int[][] actualGrid = testGrid;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedGrid, actualGrid); // confirming deletion
    }

    @Test // greatest last
    public void greatestValueOfGridLast() {
        int[][] testGrid = {{7,18,20,13,10},{20,13,6,1,2},{19,16,13,10,21}};
        int expectedInt = 21;
        int actualInt = Problem.greatestValueOfGrid(testGrid);
        int[][] expectedGrid = {{7,18,0,13,10},{0,13,6,1,2},{19,16,13,10,0}};
        int[][] actualGrid = testGrid;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedGrid, actualGrid); // confirming deletion
    }

    @Test // greatest mid
    public void greatestValueOfGridMid() {
        int[][] testGrid = {{15,18,20,13,10},{20,13,21,1,2},{19,16,13,10,6}};
        int expectedInt = 21;
        int actualInt = Problem.greatestValueOfGrid(testGrid);
        int[][] expectedGrid = {{15,18,0,13,10},{20,13,0,1,2},{0,16,13,10,6}};
        int[][] actualGrid = testGrid;
        assertEquals(expectedInt, actualInt); // confirming return
        assertArrayEquals(expectedGrid, actualGrid); // confirming deletion
    }

        // deleteGreatestValue tests

    @Test // single element grid
    public void deleteGreatestValueSingle() {
        int[][] testGrid = {{1}};
        int expectedInt = 1;
        int actualInt = Problem.deleteGreatestValue(testGrid);
        assertEquals(expectedInt, actualInt);
    }

    @Test // multiple element grid
    public void deleteGreatestValueMultiple() {
        int[][] testGrid = {{1,2,3,4},{4,3,2,1},{9,7,5,3}};
        int expectedInt = 24;
        int actualInt = Problem.deleteGreatestValue(testGrid);
        assertEquals(expectedInt, actualInt);
    }
}