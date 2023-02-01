package LeetIndexTemplate;

public class Problem {

    // url of problem
    // https://leetcode.com/problems/percentage-of-letter-in-string/

    // submitted? date?

    public int percentageLetter(String s, char letter) {

        // short-circuit if letter is not in s?
        // no, since indexOf() runs in linear time anyway!
        // why pass whole array twice?
        // if (s.indexOf(letter) == -1) {
        //     return 0;
        // }

        // to count instances of letter
        int letterCount = 0;

        // iterating over s, counting instances of letter
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                letterCount++;
            }
        }

        // loop exits with count
        // percent == double of count/ double of length * 100
        // return int of percent, which rounds down to nearest int
        return (int) (((double)letterCount / (double)s.length()) * 100);
    }

}
