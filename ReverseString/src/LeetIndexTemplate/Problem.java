package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/reverse-string/

    // SUBMISSION DATE: yyyy.mm.dd

    public static void reverseString(char[] s) {

        // char for swap ops
        char swap = ' ';

        // loop only goes through half of array
        for (int i = 0; i < s.length / 2; i++) {

            // collect character at i
            swap = s[i];

            // swap with character at opposite end
            s[i] = s[s.length - 1 - i];

            // replace opposite end with the collected character
            s[s.length - 1 - i] = swap;
        }
    }

}
