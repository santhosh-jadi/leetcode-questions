class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int m = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            // Beautiful substring cannot start with 0
            if (s.charAt(i) == '0') {
                continue;
            }

            for (int j = i + 1; j <= s.length(); j++) {

                String substring = s.substring(i, j);

                if (kcount(substring) == k) {

                    if (j - i < m) {
                        m = j - i;
                        ans = substring;
                    } 
                    else if (j - i == m && substring.compareTo(ans) < 0) {
                        ans = substring;
                    }

                    // For this i, adding more characters only makes
                    // the substring longer.
                    break;
                }
            }
        }

        return ans;
    }

    public static int kcount(String sn) {
        int c = 0;

        for (int i = 0; i < sn.length(); i++) {
            if (sn.charAt(i) == '1') {
                c++;
            }
        }

        return c;
    }
}