/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int x = 0;

        StringBuilder sb = new StringBuilder(s);

        String IV = "IV";
        String IX = "IX";
        String XL = "XL";
        String XC = "XC";
        String CD = "CD";
        String CM = "CM";

        if (s.contains(IV)) {
            x = x + 4;
            int a = s.indexOf(IV);
            sb.deleteCharAt(a + 1);
            sb.deleteCharAt(a);

        }
        if (s.contains(IX)) {
            x = x + 9;

            int a = s.indexOf(IX);
            sb.deleteCharAt(a + 1);
            sb.deleteCharAt(a);
        }
        if (s.contains(XL)) {
            x = x + 40;
            int a = s.indexOf(XL);
            sb.deleteCharAt(a + 1);
            sb.deleteCharAt(a);

        }
        if (s.contains(XC)) {
            x = x + 90;
            int a = s.indexOf(XC);
            sb.deleteCharAt(a + 1);
            sb.deleteCharAt(a);
        }
        if (s.contains(CD)) {
            x = x + 400;
            int a = s.indexOf(CD);
            sb.deleteCharAt(a + 1);
            sb.deleteCharAt(a);
        }
        if (s.contains(CM)) {
            x = x + 900;
            int a = s.indexOf(CM);
            sb.deleteCharAt(a + 1);
            sb.deleteCharAt(a);
        }

        int length = sb.length();
        for (int i = 0; i < length; i++) {
            char k = sb.charAt(i);

            if (k == 'I') {
                x = x + 1;

            }

            if (k == 'V') {
                x = x + 5;

            }

            if (k == 'X') {
                x = x + 10;

            }

            if (k == 'L') {
                x = x + 50;

            }

            if (k == 'C') {
                x = x + 100;

            }

            if (k == 'D') {
                x = x + 500;

            }

            if (k == 'M') {
                x = x + 1000;

            }

        }

        return x;
    }
}
// @lc code=end
