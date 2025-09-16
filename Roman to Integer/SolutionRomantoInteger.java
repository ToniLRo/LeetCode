public class SolutionRomantoInteger {
    public int romanToInt(String s) {
        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'I' ) {
                if (i+1 < length && s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X') {
                result += 1;}else if(i+1 == length) {
                result += 1;}
            }
            else if (s.charAt(i) == 'V' ) {
                if (i-1 >= 0 && s.charAt(i-1) != 'I' ||i == 0) {
                result += 5;}
                else if(i-1 >= 0 && s.charAt(i-1) == 'I') {
                result += 4;}
            }
            else if (s.charAt(i) == 'X' ) {
                if (i-1 >= 0 && s.charAt(i-1) != 'I' ||i == 0) {
                    if (i+1 < length && s.charAt(i+1) != 'L' && s.charAt(i+1) != 'C') {
                    result += 10;}
                    else if(i+1 == length) {
                    result += 10;}
                    }else if(i-1 >= 0 && s.charAt(i-1) == 'I') {
                result += 9;}
            }   
            else if (s.charAt(i) == 'L' ) {
                if (i-1 >= 0 && s.charAt(i-1) != 'X' ||i == 0) {
                result += 50;}
                else if(i-1 >= 0 && s.charAt(i-1) == 'X') {
                result += 40;}
            }
            else if (s.charAt(i) == 'C' ) {
                if (i-1 >= 0 && s.charAt(i-1) != 'X' ||i == 0) {
                    if (i+1 < length && s.charAt(i+1) != 'D' && s.charAt(i+1) != 'M') {
                    result += 100;}
                    else if(i+1 == length) {
                    result += 100;}
                    }else if(i-1 >= 0 && s.charAt(i-1) == 'X') {
                result += 90;}
            }
            else if (s.charAt(i) == 'D' ) {
                if (i-1 >= 0 && s.charAt(i-1) != 'C' ||i == 0) {
                result += 500;}
                else if(i-1 >= 0 && s.charAt(i-1) == 'C') {
                result += 400;}
            }
            else if (s.charAt(i) == 'M') {
                if (i-1 >= 0 && s.charAt(i-1) != 'C' ||i == 0) {
                result += 1000;}
                else if(i-1 >= 0 && s.charAt(i-1) == 'C') {
                result += 900;}
            }  
            }
                    return result;
    }    
}
