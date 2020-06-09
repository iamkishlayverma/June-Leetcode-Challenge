class Solution {
    public boolean isSubsequence(String s, String t) {
        int i, j = 0;
        for (i=0; i<t.length() && j<s.length(); i++) {
            if (t.charAt(i) == s.charAt(j))
                j++;
        }
        if (j == s.length())
            return true;
        return false;
    }
}
