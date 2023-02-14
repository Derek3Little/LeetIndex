package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/

    // SUBMISSION DATE: yyyy.mm.dd

    public static String generateTheString(int n) {

        // for building string to return
        StringBuilder stringBuilder = new StringBuilder();

        // odds can return string of all one character
        if (n % 2 != 0) {

            for (int i = 0; i < n; i++) {
                stringBuilder.append('q');
            }

            // evens require a different character up front
        } else {

            stringBuilder.append('p');

            // start loop from 1 to account for the p
            for (int i = 1; i < n; i++) {
                stringBuilder.append('q');
            }

        }

        return stringBuilder.toString();
    }

}
