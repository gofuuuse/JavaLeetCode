package Problems.P4;

public class P4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        for(int i = 0,j = 0,k = 0;i<result.length;i++) {
            if(j<nums2.length && k<nums1.length) result[i] = nums1[k] > nums2[j] ? nums2[j++] : nums1[k++];
            else if(j<nums2.length) result[i] = nums2[j++];
            else if(k<nums1.length) result[i] = nums1[k++];
        }
        return result.length%2==0 ? (double) (result[(result.length) / 2 - 1] + result[(result.length) / 2]) /2 : result[(result.length) / 2];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
