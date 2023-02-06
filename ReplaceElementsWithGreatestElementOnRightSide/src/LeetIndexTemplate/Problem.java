package LeetIndexTemplate;

public class Problem {

    // url of problem
    // https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

    // SUBMITTED 2023.02.06

    public static int[] replaceElements(int[] arr) {

        // tracking greatest value encountered
        int greatest = arr[arr.length - 1];

        // for swap op
        int swap = 0;

        // set last index to -1
        arr[arr.length - 1] = -1;

        // iterating over remaining elements in reverse, all the way through
        for (int i = arr.length - 2; i > -1; i--) {

            // if new greatest is encountered, perform swap op
            if (arr[i] > greatest) {
                swap = arr[i];
                arr[i] = greatest;
                greatest = swap;
            } else { // if not, it becomes current greatest
                arr[i] = greatest;
            }
        }

        // on loop exit arr is built, return it!
        return arr;
    }

}
