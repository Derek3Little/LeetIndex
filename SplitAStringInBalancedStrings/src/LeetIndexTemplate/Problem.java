package LeetIndexTemplate;

public class Problem {


    // url of problem
    // https://leetcode.com/problems/split-a-string-in-balanced-strings/

    // SUBMITTED? 2023.02.07???

    public static int balancedStringSplit(String s) {

        // fields for ops
        int stringCount = 0;
        int lCount = 0;
        int rCount = 0;

        // looping through s
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'L') { // if L..

                // increment count of Ls
                lCount++;

                // if counts are equal, add to stringCounts and reset
                if (lCount == rCount) {
                    stringCount++;
                    lCount = 0;
                    rCount = 0;
                }

            } else { // R is only other option

                // increment count of Rs
                rCount++;

                // if count is equal, add to stringCount and reset
                if (lCount == rCount) {
                    stringCount++;
                    lCount = 0;
                    rCount = 0;
                }
            }
        }

        // return the final stringCount after loop exit
        return stringCount;
    }

}
