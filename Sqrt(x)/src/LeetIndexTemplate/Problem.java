package LeetIndexTemplate;

public class Problem {

    // url of problem
    // https://leetcode.com/problems/sqrtx/

    // SUBMITTED 2023.02.05

    public static int mySqrt(int x) {

        // handling edge cases
        if (x == 0 || x == 1) {
            return x;
        }

        long lo = 1; // the minimum of the search space, long to account for values too large for int
        long hi = x; // the maximum of the search space

        while (lo < hi) { // binary search season!

            long mid = lo + (hi - lo) / 2; // find mid

            if (mid * mid > x) { // if greater, new hi is mid
                hi = mid;
            } else {
                lo = mid + 1; // if lesser, new low is mid + 1
            }
        } // loop exits when lo crosses hi

        return (int) lo - 1; // return must be converted from long to int

        // standard issue binary search: O(logN)
    }
}
