package Day2;

public class day2 {
	public static int  findMissingNumber(int[] arr) {
		int n = arr.length; 
		
		if(arr[0] != 1) {
			return 1;
		}
		
		for(int i=0; i<n-1; i++) {
			if(arr[i+1] != arr[i]+1) {
				return arr[i]+1;
			}
		}
        return n+1;
	}
	public static void main(String[] args) {
		System.out.println(findMissingNumber(new int[]{1, 2, 4, 5})); // 3
        System.out.println(findMissingNumber(new int[]{2, 3, 4, 5})); // 1
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4})); // 5
        System.out.println(findMissingNumber(new int[]{1}));
	}
}
