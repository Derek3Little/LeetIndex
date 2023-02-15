package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/determine-color-of-a-chessboard-square/

    // SUBMISSION DATE: yyyy.mm.dd

    public static boolean squareIsWhite(String coordinates) {

        // default false on hypothetical 'a1'
        boolean white = false;

        // from default a1, toggle on 'odd' characters
        switch (coordinates.charAt(0)) {
            case 'b', 'd', 'f', 'h':
                white = !white;
                break;
        }

        // from default a1, toggle on even numbers
        switch (coordinates.charAt(1)) {
            case '2', '4', '6', '8':
                white = !white;
                break;
        }

        return white;
    }
}
