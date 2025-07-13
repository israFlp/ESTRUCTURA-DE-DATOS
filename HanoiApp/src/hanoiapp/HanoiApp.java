
package hanoiapp;


public class HanoiApp {
    public static void main(String[] args) {
        int numDiscos = 3;
        Torre torreA = new Torre("A");
        Torre torreB = new Torre("B");
        Torre torreC = new Torre("C");

        for (int i = numDiscos; i >= 1; i--) {
            torreA.apilar(i);
        }

        HanoiSolver.resolverHanoi(numDiscos, torreA, torreC, torreB);
    }
    
 }
