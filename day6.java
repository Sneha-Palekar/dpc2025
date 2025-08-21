import java.util.*;

public class day6 {
	public static List<int[]> findZeroSumSubarrays(int[] arr) {
        int n = arr.length;
        List<int[]> result = new ArrayList<>();
        Map<Long, List<Integer>> prefixMap = new HashMap<>();

        long prefixSum = 0;

        prefixMap.put(0L, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixMap.containsKey(prefixSum)) {
                for (int startIdx : prefixMap.get(prefixSum)) {
                    result.add(new int[]{startIdx + 1, i});
                }
            }

            prefixMap.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
	
	private static String format(List<int[]> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int[] pair : list) {
            sb.append("(").append(pair[0]).append(", ").append(pair[1]).append("), ");
        }
        if (!list.isEmpty()) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(format(findZeroSumSubarrays(new int[]{1, 2, -3, 3, -1, 2}))); // [(0, 2), (1, 3)]
        System.out.println(format(findZeroSumSubarrays(new int[]{4, -1, -3, 1, 2, -1}))); // [(1, 2), (0, 3)]
        System.out.println(format(findZeroSumSubarrays(new int[]{1, 2, 3, 4}))); // []
        System.out.println(format(findZeroSumSubarrays(new int[]{0, 0, 0}))); // [(0,0),(0,1),(0,2),(1,1),(1,2),(2,2)]
        System.out.println(format(findZeroSumSubarrays(new int[]{-3, 1, 2, -3, 4, 0}))); // [(0,3),(4,4)]
	}
}
