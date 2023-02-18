package LeetIndexTemplate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem {

    // url of problem:
    // https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/

    // SUBMISSION DATE: 2023.02.18

    public static boolean areOccurrencesEqual(String s) {

        // hashmap to collect characters and their counts
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        // loop through entire string
        for (int i = 0; i < s.length(); i++) {

            // if character is present, increment the count
            if (hashMap.containsKey(s.charAt(i))) {
                int count = hashMap.get(s.charAt(i));
                count++;
                hashMap.put(s.charAt(i), count);
            } else { // if not, add with initial count of 1
                hashMap.put(s.charAt(i), 1);
            }
        }

        // set to collect distinct counts
        Set<Integer> checkSet = new HashSet<>();

        // loading all distinct counts into set
        checkSet.addAll(hashMap.values());

        // confirm set has one distinct count and return
        return checkSet.size() == 1;
    }
}
