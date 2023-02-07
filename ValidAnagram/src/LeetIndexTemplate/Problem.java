package LeetIndexTemplate;

import java.util.HashMap;

public class Problem {

    // url of problem
    // https://leetcode.com/problems/valid-anagram/

    // SUBMITTED? 2023.02.08???

    public static boolean isAnagram(String s, String t) {

        // strings must be of equal length
        if (s.length() != t.length()) {
            return false;
        }

        // build hashMaps of each strings' characters and their counts
        HashMap<Character, Integer> smap = hashMapify(s);
        HashMap<Character, Integer> tmap = hashMapify(t);

        // check characters and counts of the hashmaps against one of the strings
        for (int i = 0; i < s.length(); i++) {
            if (smap.get(s.charAt(i)) != tmap.get(s.charAt(i))) {
                // return false if counts do not match
                return false;
            }
        }

        // if loop exits without throwing false, all counts and characters match, return true!
        return true;
    }

    // method returning a populated hashmap of characters and their counts
    public static HashMap<Character, Integer> hashMapify(String string) {

        // hashmap will store characters as keys, and their counts as values
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        // populate hashmap with String s
        for (int i = 0; i < string.length(); i++) {

            // if hashmap does not already contain character at index, add character with count of 1
            if (!hashMap.containsKey(string.charAt(i))) {
                hashMap.put(string.charAt(i), 1);
            } else {

                // if hashmap already contains character at index, increment the count
                int count = hashMap.get(string.charAt(i));
                count++;
                hashMap.put(string.charAt(i), count);
            }
        }

        // return the hashmap populated with characters and counts
        return hashMap;
    }

    
}
