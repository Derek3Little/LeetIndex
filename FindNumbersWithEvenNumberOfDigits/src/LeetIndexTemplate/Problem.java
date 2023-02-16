package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    // SUBMISSION DATE: yyyy.mm.dd

    public static int findNumbers(int[] nums) {

        // count for return
        int count = 0;



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
