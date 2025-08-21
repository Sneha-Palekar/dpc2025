import java.util.*;

public class day7 {
    public int trap(int[] height) {
        int n = height.length;
        if (n < 3) return 0; // less than 3 bars can't trap water

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        day7 obj = new day7();
        
        System.out.println(obj.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1})); // 6
        System.out.println(obj.trap(new int[]{4,2,0,3,2,5}));             // 9
        System.out.println(obj.trap(new int[]{1,1,1}));                   // 0
        System.out.println(obj.trap(new int[]{5}));                       // 0
        System.out.println(obj.trap(new int[]{2,0,2}));                   // 2
    }
}
