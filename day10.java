import java.util.*;

public class day10 {
	public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // sort letters to form the key
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"eat", "tea", "tan", "ate", "nat", "bat"},   // [["eat","tea","ate"],["tan","nat"],["bat"]]
            {""},                                         // [[""]]
            {"a"},                                        // [["a"]]
            {"abc", "bca", "cab", "xyz", "zyx", "yxz"},   // [["abc","bca","cab"],["xyz","zyx","yxz"]]
            {"abc", "def", "ghi"}                         // [["abc"],["def"],["ghi"]]
        };

        for (String[] test : testCases) {
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Output: " + groupAnagrams(test));
            System.out.println();
        }
    }
}
