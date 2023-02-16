package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    // SUBMISSION DATE: 2023.02.16

    public static int findNumbers(int[] nums) {

        // count for return
        int count = 0;

        // loop through all nums
        for (int num : nums) {

            // get modulo of digit count, if zero add to count of evens
            if (findDigitCount(num) % 2 == 0) {
                count++;
            }
        }

        // return final count of evens
        return count;
    }

    // method returns digit count of a num
    public static int findDigitCount(int num) {

        // count for return
        int count = 0;

        // count of digits by dividing digit by 10
        while (num > 0) {
            count++;
            num = num / 10;
        }

        // return count of digits
        return count;
    }
}
