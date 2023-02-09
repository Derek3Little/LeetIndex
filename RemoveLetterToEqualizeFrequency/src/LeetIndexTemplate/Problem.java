package LeetIndexTemplate;

import java.util.HashMap;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/remove-letter-to-equalize-frequency/

    // SUBMISSION DATE: yyyy.mm.dd

    public static boolean equalFrequency(String word) {

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
            if (countsOfCounts.containsKey(charCountArray[i])) { // if found, increment count
                int count = countsOfCounts.get(charCountArray[i]);
                count++;
                countsOfCounts.put(charCountArray[i], count);
            } else { // if not found, add with initial count of 1
                countsOfCounts.put(charCountArray[i], 1);
            }
        }

        

        return false;
    }

}
