public class SolutionValidParentheses {
    public boolean isValid(String s) {  
        char[] stack = new char[s.length()];
        int top = -1;
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // "Push" en el stack
                top++;
                stack[top] = c;
            } else {
                // "Pop" y chequear coincidencia
                if (top == -1) return false; // No hay nada que cerrar
                if (c == ')' && stack[top] != '(') return false;
                if (c == '}' && stack[top] != '{') return false;
                if (c == ']' && stack[top] != '[') return false;
                top--; // Quitar el último elemento
            }
        }
        
        // Si top == -1, todos los paréntesis fueron cerrados correctamente
        return top == -1;
    }
}

