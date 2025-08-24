
public class day9 {
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"apple", "ape", "april"};
        String[] test4 = {""};
        String[] test5 = {"alone"};
        String[] test6 = {};

        System.out.println("\"" + longestCommonPrefix(test1) + "\""); // "fl"
        System.out.println("\"" + longestCommonPrefix(test2) + "\""); // ""
        System.out.println("\"" + longestCommonPrefix(test3) + "\""); // "ap"
        System.out.println("\"" + longestCommonPrefix(test4) + "\""); // ""
        System.out.println("\"" + longestCommonPrefix(test5) + "\""); // "alone"
        System.out.println("\"" + longestCommonPrefix(test6) + "\""); // ""
    }
}
