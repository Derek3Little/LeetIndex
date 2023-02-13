package LeetIndexTemplate;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/self-dividing-numbers/

    // SUBMISSION DATE: 2023.02.13

    public static List<Integer> selfDividingNumbers(int left, int right) {

        // build an arrayList of the range
        ArrayList<Integer> arrayList = new ArrayList<>(right - left + 1);

        for (int i = left; i < right + 1; i++) {
            if (selfDividify(i)) {
                arrayList.add(i);
            }
        }

        return arrayList;
    }

    public static boolean selfDividify(int number) {
        int digit = number;
        while (digit > 0) {
            // self-dividing numbers cannot contain 0
            if (digit % 10 == 0 || number % (digit % 10) != 0) {
                return false;
            }
            digit = digit / 10;
        }

        // if no false thrown, return true
        return true;
    }

}
