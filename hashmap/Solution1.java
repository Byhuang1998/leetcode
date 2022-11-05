package hashmap;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/11/5 23:11
 * @description TODO
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i <len; i++) {
            map.put(nums[i],i);
        }
        for (int i=0; i<len; i++) {
            int dif = target - nums[i];
            if (map.get(dif) != null && map.get(dif) != i) {
                ans[0] = i;
                ans[1] = map.get(dif);
                // 因为肯定会有重复，第一次找到的是顺序的，直接返回
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        Arrays.stream(res).forEach(System.out::println);
    }
}
