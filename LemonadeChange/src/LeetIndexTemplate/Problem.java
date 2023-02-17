package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/lemonade-change/

    // SUBMISSION DATE: 2023.02.17

    public static boolean lemonadeChange(int[] bills) {

        // no change to be had when 10/20 first
        if (bills[0] == 10 || bills[0] == 20) {
            return false;
        }

        // register of 5s, 10s, 20s
        int[] register = {0, 0, 0};

        // looping through bills, switching each
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5:
                    register[0]++;
                    break;
                case 10:
                    register[1]++;
                    register[0]--;
                    break;
                case 20:
                    // twenties can be changed in various ways, use tens first
                    register[2]++;
                    if (register[1] > 0) {
                        register[1]--;
                        register[0]--;
                    } else {
                        register[0] -= 3;
                    }
            }

            // if fives end at less than zero, return false
            if (register[0] < 0) {
                return false;
            }
        }

        // no false thrown, return true
        return true;
    }
}
