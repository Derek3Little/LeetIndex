package LeetIndexTemplate;

import java.util.Arrays;
import java.util.HashMap;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/remove-letter-to-equalize-frequency/

    // SUBMISSION DATE: yyyy.mm.dd

    public static boolean equalFrequency(String word) {

        // minimum string edge case check
        if (word.length() == 2) {
            return true;
        }

        // first hashmap collects characters and their counts
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // populating first hashmap
        for (int i = 0; i < word.length(); i++) {

            if (characterCounts.containsKey(word.charAt(i))) { // if found, increment count
                int count = characterCounts.get(word.charAt(i));
                count++;
                characterCounts.put(word.charAt(i), count);
            } else { // if not found, add with initial count of 1
                characterCounts.put(word.charAt(i), 1);
            }
        }

        // can equalize iff two distinct counts, and difference between them is 1

        // second hashmap collects counts of the characterCounts
        HashMap<Integer, Integer> countsOfCounts = new HashMap<>();

        // iterable array of counts for population ops
        Integer[] charCountArray = characterCounts.values().toArray(new Integer[0]);

        // populating second hashmap
        for (int i = 0; i < charCountArray.length; i++) {

            // proceed with populating
            if (countsOfCounts.containsKey(charCountArray[i])) { // if found, increment count
                int count = countsOfCounts.get(charCountArray[i]);
                count++;
                countsOfCounts.put(charCountArray[i], count);
            } else { // if not found, add with initial count of 1
                countsOfCounts.put(charCountArray[i], 1);
            }

            // more than two counts is an autofalse, short-circuit!
            if (countsOfCounts.size() > 2) {
                return false;
            }
        }

        // if there is only one distinct count equal to the length of the word, all elements have a count of one, and
        // any one element can be removed to equalize frequency
        if (countsOfCounts.size() == 1 && characterCounts.size() == word.length()) {
            return true;
        }

        // with single count case handled, one of those two counts must be one
        if (!countsOfCounts.values().contains(1)) {
            return false;
        }

        // the greater of the two values must be greater by one, easily comparable array
        Integer[] finalCounts = countsOfCounts.keySet().toArray(new Integer[0]);

        // sort array to index greater/lesser
        Arrays.sort(finalCounts);

        // having sorted, if there is only 1 of count 1, it can be removed to equalize!
        if (countsOfCounts.get(finalCounts[0]) == 1 && finalCounts[0] == 1) {
            return true;
        }

        // final check, [1] - [0] == 1, and count of [1] < count of [0]
        if (finalCounts[1] - finalCounts[0] == 1
                && countsOfCounts.get(finalCounts[1]) <= countsOfCounts.get(finalCounts[0])) {
            return true;
        } else {
            return false;
        }
    }
}
