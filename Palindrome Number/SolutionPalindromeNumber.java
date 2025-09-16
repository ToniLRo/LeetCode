
public class SolutionPalindromeNumber {
    public boolean isPalindrome(int x) {
        if ( x < 0) return false;
        if ( String.valueOf(x).length() == 1) return true;
        int n = String.valueOf(x).length();
        String ans = "";
                if (String.valueOf(x).charAt(0) == String.valueOf(x).charAt(n-1)) { 
                    ans = String.valueOf(x).substring(0, n+1);  
                }

        
        if(ans.length() == 0) {
            return false;
        }
        return true;
    }
}
