package hashmap;

import java.util.HashMap;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/11/6 22:37
 * @description TODO
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                // 这一行绝妙
                // 用案例 "abcdcb"手工模拟一下就知道这一句可以省多少事
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int ret = solution.lengthOfLongestSubstring("abcdcb");
        System.out.println(ret);
    }

}
