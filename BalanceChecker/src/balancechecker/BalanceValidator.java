
package balancechecker;
import java.util.Stack;


public class BalanceValidator {
     /**
     * Verifica si los paréntesis, corchetes y llaves están balanceados.
     *
     * @param expresion Cadena con la expresión matemática.
     * @return true si está balanceada, false en caso contrario.
     */
    public static boolean estaBalanceado(String expresion) {
         Stack<Character> pila = new Stack<>();

         for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;

                char tope = pila.pop();
                if (!esPareja(tope, c)) return false;
            }
        }

        return pila.isEmpty(); // Si está vacía, está balanceada.
    }

    private static boolean esPareja(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}');
    }
    
}
