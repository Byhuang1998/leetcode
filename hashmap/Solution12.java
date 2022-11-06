package hashmap;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/11/6 22:41
 * @description TODO
 */
public class Solution12 {

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int[] array = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i=0; i<13; i++) {
            while (num >= array[i]) {
                ans.append(romans[i]);
                num -= array[i];
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        String ret = solution.intToRoman(1994);
        System.out.println(ret);
    }

}
