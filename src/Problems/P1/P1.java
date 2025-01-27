package Problems.P1;

import java.util.Arrays;

public class P1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];
        for(int i = 0;i<nums.length-1;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }
        return sums;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("Result -> " + Arrays.toString(twoSum(nums,target)));
    }
}
