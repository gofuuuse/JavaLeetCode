package Problems.P3;

public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        String result = s.length() == 1? " " : "";
        for(int i = 0;i<s.length()-1;i++) {
            String forI = "";
            for(int j = i+1;j<s.length()+1;j++) {
                String newSub = s.substring(i,j);
                String checker = s.substring(j-1,j);
                if(newSub.indexOf(checker) != newSub.length() -1) {
                    forI = newSub.substring(0,newSub.length() -1);
                    break;
                }
                forI = newSub;
            }
            result = forI.length() > result.length() ? forI : result;
        }
        return result.length();
    }

    public static void main(String[] args) {
        String s = "au";
        System.out.println("Result -> " + lengthOfLongestSubstring(s));
    }
}
