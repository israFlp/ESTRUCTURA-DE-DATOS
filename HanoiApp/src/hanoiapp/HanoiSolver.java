
package hanoiapp;

public class HanoiSolver {
    /**
     * Resuelve el problema de las Torres de Hanoi utilizando recursión.
     *
     * @param n Número de discos
     * @param origen Torre origen
     * @param destino Torre destino
     * @param auxiliar Torre auxiliar
     */
    public static void resolverHanoi(int n, Torre origen, Torre destino, Torre auxiliar) {
        if (n == 1) {
            moverDisco(origen, destino);
        } else {
            resolverHanoi(n - 1, origen, auxiliar, destino);
            moverDisco(origen, destino);
            resolverHanoi(n - 1, auxiliar, destino, origen);
        }
    }

    private static void moverDisco(Torre desde, Torre hacia) {
        int disco = desde.desapilar();
        hacia.apilar(disco);
        System.out.println("Mover disco " + disco + " de " + desde.getNombre() + " a " + hacia.getNombre());
    }
    
}
