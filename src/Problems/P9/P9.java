package Problems.P9;

public class P9 {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x!= 0)){
            return false;
        }
        int n=0;
        int cop = x;
        while(cop>0){
            n = n * 10 + cop%10;
            cop = cop / 10;
        }
        if(n==x){
            return true;
        }
        return false;
    }
}
