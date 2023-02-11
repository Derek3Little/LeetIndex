package LeetIndexTemplate;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/delete-greatest-value-in-each-row/

    // SUBMISSION DATE: yyyy.mm.dd

    public static int deleteGreatestValue(int[][] grid) {

        return 0;
    }

    // collecting greatest value of a given row, 'deleting' by replacing with '0'
    // note problem constraint requires minimum element value of '1'
    public static int greatestValueOfRow(int[] row) {

        // tracking index of greatest
        // initialized to value less than lowest possible value (0) given in constraints (1-50)
        int indexOfGreatest = 0;

        // tracking greatest value
        int valueOfGreatest = 0;

        // loop through columns of row
        for (int i = 0; i < row.length; i++) {

            // if new greatest value is found,
            if (row[i] > row[indexOfGreatest]) {

                // collect the index
                indexOfGreatest = i;;
            }
        }

        // loop exits with index of greatest value, record greatest value for return
        valueOfGreatest = row[indexOfGreatest];

        // 'delete' value at the index
        row[indexOfGreatest] = 0;

        // return the value!
        return valueOfGreatest;
    }

    // collecting greatest value of full grid by calling greatestValueOfRow on every row
    // this will delete the greatest value in each row, and return the greatest of those deleted values
    public static int greatestValueOfGrid(int[][] rows) {

        // tracking value of greatest
        // initialized to value less than lowest possible value (0) given in constraints (1-50)
        int greatestValue = 0;

        // looping through rows, comparing greatest values
        for (int i = 0; i < rows.length; i++) {

            // collect greatest value of the row
            int newValue = greatestValueOfRow(rows[i]);

            // compare it to greatest value of rows
            if (newValue > greatestValue) {

                // if greater, it is the greatest
                greatestValue = newValue;
            }
        }

        return greatestValue;
    }
}
