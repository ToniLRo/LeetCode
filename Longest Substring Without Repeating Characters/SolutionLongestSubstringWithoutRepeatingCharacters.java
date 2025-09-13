import java.util.HashSet;
import java.util.Set;


class SolutionLongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        java.util.Set<Character> set = new java.util.HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // Si el carácter ya está en el set, movemos la ventana
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Agregamos el carácter actual al set
            set.add(s.charAt(right));
            
            // Actualizamos la longitud máxima
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    // Método main para probar la solución
    public static void main(String[] args) {
    	SolutionLongestSubstringWithoutRepeatingCharacters solution = new SolutionLongestSubstringWithoutRepeatingCharacters();
        String s = "geeksforgeeks";
        System.out.println(solution.lengthOfLongestSubstring(s));
    
    }

}