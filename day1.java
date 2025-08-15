package Day1;

import java.util.*;
import java.util.Scanner;

public class day1 {
	public static void sortNums(int arr[]) {
		int low=0, mid=0, high=arr.length - 1;
		
		while(mid <= high) {
			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		if(n == 0) {
			System.out.println("[]");
			return;
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sortNums(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
