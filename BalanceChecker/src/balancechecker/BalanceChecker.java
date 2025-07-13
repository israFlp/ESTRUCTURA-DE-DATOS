
package balancechecker;


public class BalanceChecker {

   
    public static void main(String[] args) {
         String expresion = "{7 + (8 * 5) - [(9 - 7) + (4 + 1)]}";
        if (BalanceValidator.estaBalanceado(expresion)) {
            System.out.println("Fórmula balanceada.");
        } else {
            System.out.println("Fórmula no balanceada.");
        }
        
    }
    
}
