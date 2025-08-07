package Problems.P12;

public class P12 {
    public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC","L","XL","X","IX","V","IV","I"};
        int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i = 0;
        StringBuilder result = new StringBuilder("");
        while(num>0) {
            result.append(roman[i].repeat(num/number[i]));
            num%=number[i];
            i++;

        }

        return result.toString();
    }
}
