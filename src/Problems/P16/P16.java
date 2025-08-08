package Problems.P16;

import java.util.Arrays;

public class P16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left<right) {
                int total = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - total) < Math.abs(target - closestSum)) {
                    closestSum = total;
                }
                if (total < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
