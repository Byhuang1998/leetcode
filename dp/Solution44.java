package dp;

import hashmap.Solution1;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2022/11/5 23:19
 * @description TODO
 */
public class Solution44 {

    public boolean isMatch(String s, String p) {
            int m = s.length();
            int n = p.length();
            boolean[][] dp = new boolean[m+1][n+1];
            dp[0][0] = true;
            for (int i=0; i<n; i++) {
                if (p.charAt(i) == '*') dp[0][i+1] = true;
                else break;
            }
            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    if (p.charAt(j) == '?') {
                        dp[i+1][j+1] = dp[i][j];
                    } else if (p.charAt(j) == '*') {
                        dp[i+1][j+1] = dp[i+1][j]|dp[i][j+1] ;
                    } else {
                        if (p.charAt(j) == s.charAt(i)) {
                            dp[i+1][j+1] = dp[i][j];
                        } else {
                            dp[i+1][j+1] = false;
                        }
                    }
                }
            }
            return dp[m][n];
        }

    public static void main(String[] args) {
        Solution44 solution = new Solution44();
        String s = "aa", p = "a";
        boolean match = solution.isMatch(s, p);
        System.out.println(match);
    }
}
