package LeetIndexTemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test // black
    public void isBlack() {
        String testCoordinates = "a1";
        Boolean expected = false;
        Boolean actual = Problem.squareIsWhite(testCoordinates);
        assertEquals(expected, actual);
    }

    @Test // white
    public void isWhite() {
        String testCoordinates = "b1";
        Boolean expected = true;
        Boolean actual = Problem.squareIsWhite(testCoordinates);
        assertEquals(expected, actual);
    }

    @Test // black on opposite end of board
    public void isBlackOpposite() {
        String testCoordinates = "h8";
        Boolean expected = false;
        Boolean actual = Problem.squareIsWhite(testCoordinates);
        assertEquals(expected, actual);
    }

    @Test // white on opposite end of board
    public void isWhiteOpposite() {
        String testCoordinates = "g8";
        Boolean expected = true;
        Boolean actual = Problem.squareIsWhite(testCoordinates);
        assertEquals(expected, actual);
    }
}