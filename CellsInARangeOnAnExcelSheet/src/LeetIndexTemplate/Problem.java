package LeetIndexTemplate;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/

    // SUBMISSION DATE: yyyy.mm.dd

    public static List<String> cellsInRange(String s) {

        // arraylist for population and return
        List<String> returnList = new ArrayList<>();

        // stringbuilder for building list elements
        StringBuilder stringBuilder = new StringBuilder();

        char startCol = s.charAt(0);
        char endCol = s.charAt(3);
        endCol++; // inc to include last element

        char startRow = s.charAt(1);
        startRow--; // dec to include first element
        char endRow = s.charAt(4);

        char col = startCol;
        char row = startRow;

        // moving through columns
        while (col != endCol) {

            // resetting row
            row = startRow;

            // moving through rows
            while (row != endRow) {
                row++;

                // build string with new cell
                stringBuilder.append(col);
                stringBuilder.append(row);

                // add cell to list
                returnList.add(stringBuilder.toString());

                // resetting builder after add to returnList
                stringBuilder.delete(0,2);
            }
            col++;
        }

        return returnList;
    }

}
