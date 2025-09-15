
class SolutionLongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) { 
                    ans = s.substring(i, j+1);  
                }
            }
        }
        
        if(ans.length() == 0) {
            return s.substring(0, 1);
        }
        return ans;
    }
}   