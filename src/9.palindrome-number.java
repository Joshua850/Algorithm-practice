/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);

        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            newStr = newStr + str.charAt(i);

        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            char chB = newStr.charAt(i);

            if (ch != chB) {
                flag = false;
                break;
            }

        }
        return flag;

    }
}
// @lc code=end
