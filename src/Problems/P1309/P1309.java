package Problems.P1309;

public class P1309 {
    public String freqAlphabets(String s) {
        String result = "";
        int sDigit = 0;
        int digit = 0;
        for(int i = 0;i<s.length();i++) {
            if('1' <= s.charAt(i) && s.charAt(i) <= '9' ) {
                if(i + 1 <= s.length()-2 && s.charAt(i+1) == '0'){
                    sDigit = Integer.parseInt("" + s.charAt(i) + s.charAt(i+1));
                    digit = sDigit + 96;
                    result += Character.toChars(digit)[0];
                    i = i + 2;
                }

                else {
                    if(i + 2 <= s.length()-1 && s.charAt(i+2) == '#') {
                        sDigit = Integer.parseInt("" + s.charAt(i) + s.charAt(i+1));
                        digit = sDigit + 96;
                        result += Character.toChars(digit)[0];
                        i = i + 2;
                    }
                    else {
                        digit = s.charAt(i) + 96 - 48;
                        result += Character.toChars(digit)[0];
                    }
                }
            }
        }

        return result;
    }
}
