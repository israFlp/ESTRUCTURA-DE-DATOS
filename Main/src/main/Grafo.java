
package main;
import java.util.*;

public class Grafo {
    private Map<Nodo, List<Nodo>> listaAdyacencia;

    public Grafo() {
        listaAdyacencia = new HashMap<>();
    }

    // Agregar nodo
    public void agregarNodo(Nodo nodo) {
        listaAdyacencia.putIfAbsent(nodo, new ArrayList<>());
    }

    // Agregar arista (no dirigida)
    public void agregarArista(Nodo origen, Nodo destino) {
        listaAdyacencia.get(origen).add(destino);
        listaAdyacencia.get(destino).add(origen);
    }

    // Mostrar grafo
    public void mostrarGrafo() {
        for (Nodo nodo : listaAdyacencia.keySet()) {
            System.out.print(nodo + " -> ");
            for (Nodo adyacente : listaAdyacencia.get(nodo)) {
                System.out.print(adyacente + " ");
            }
            System.out.println();
        }
    }

    // Calcular grado de los nodos
    public void calcularGrados() {
        System.out.println("Grados de los nodos:");
        for (Nodo nodo : listaAdyacencia.keySet()) {
            int grado = listaAdyacencia.get(nodo).size();
            System.out.println(nodo + ": " + grado);
        }
    }
}
