package Day4;

import java.util.*;

public class day4 {
	public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int[] merged = new int[m + n];

        for (int i = 0; i < m; i++) {
            merged[i] = arr1[i];
        }

        for (int j = 0; j < n; j++) {
            merged[m + j] = arr2[j];
        }
        
        Arrays.sort(merged);

        for (int i = 0; i < m; i++) {
            arr1[i] = merged[i];
        }

        for (int j = 0; j < n; j++) {
            arr2[j] = merged[m + j];
        }
    }

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
	}
}
