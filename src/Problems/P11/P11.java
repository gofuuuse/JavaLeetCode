package Problems.P11;

public class P11 {
    public int maxArea(int[] height) {
        int maxi = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right) {
            int miniOf = Math.min(height[left],height[right]);
            int distance = right-left;
            maxi = (maxi<(miniOf*distance) ? miniOf*distance : maxi );
            if(height[left]>height[right]) {
                right--;
            }
            else{
                left++;
            }
        }

        return maxi;
    }

}
