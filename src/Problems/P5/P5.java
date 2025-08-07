package Problems.P5;

public class P5 {
    public String longestPalindrome(String s) {
        if(s == null || s.length()<1){
            return null;
        }
        int start = 0;
        int end = 0;
        for(int i = 0 ; i<s.length();i++){
            int len1 = expandTheMiddle(s,i,i);
            int len2 = expandTheMiddle(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - ((len-1)/2);
                end = i + (len/2);
            }

        }
        return s.substring(start,end+1);
    }


    public int expandTheMiddle(String s, int left, int right) {
        if(s == null || left>right) {
            return 0;
        }
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;

    }
}
