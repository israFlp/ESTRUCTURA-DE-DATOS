
package hanoiapp;
import java.util.Stack;


public class Torre {
    private Stack<Integer> discos;
    private String nombre;

    public Torre(String nombre) {
        this.nombre = nombre;
        this.discos = new Stack<>();
    }

    public void apilar(int disco) {
        discos.push(disco);
    }

    public int desapilar() {
        return discos.pop();
    }

    public boolean estaVacia() {
        return discos.isEmpty();
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Torre " + nombre + ": " + discos);
    }
    
}
