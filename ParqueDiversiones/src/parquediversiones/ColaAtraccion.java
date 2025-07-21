
package parquediversiones;

import java.util.LinkedList;
import java.util.Queue;
public class ColaAtraccion {
    private Queue<Persona> cola;
    private final int LIMITE = 30;
    private int contador;

    public ColaAtraccion() {
        cola = new LinkedList<>();
        contador = 0;
    }

    public boolean agregarPersona(String nombre) {
        if (cola.size() < LIMITE) {
            contador++;
            cola.add(new Persona(nombre, contador));
            return true;
        }
        return false;
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("No hay personas en la cola.");
        } else {
            System.out.println("Personas en la cola:");
            for (Persona p : cola) {
                System.out.println(p);
            }
        }
    }

    public boolean estaLlena() {
        return cola.size() == LIMITE;
    }
    
}
