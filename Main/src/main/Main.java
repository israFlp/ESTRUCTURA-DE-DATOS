
package main;


public class Main {

    
    public static void main(String[] args) {
        // Crear nodos
        Nodo A = new Nodo("A");
        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");
        Nodo E = new Nodo("E");

        // Crear grafo
        Grafo grafo1 = new Grafo();

        // Agregar nodos al grafo
        grafo1.agregarNodo(A);
        grafo1.agregarNodo(B);
        grafo1.agregarNodo(C);
        grafo1.agregarNodo(D);
        grafo1.agregarNodo(E);

        // Agregar aristas
        grafo1.agregarArista(A, B);
        grafo1.agregarArista(A, C);
        grafo1.agregarArista(B, C);
        grafo1.agregarArista(B, D);
        grafo1.agregarArista(C, E);
        grafo1.agregarArista(D, E);

        // Mostrar grafo
        System.out.println("Grafo 1:");
        grafo1.mostrarGrafo();

        // Calcular grados
        grafo1.calcularGrados();

        // --- Segundo grafo ---
        Nodo F = new Nodo("F");
        Nodo G = new Nodo("G");
        Nodo H = new Nodo("H");

        Grafo grafo2 = new Grafo();

        // Agregar nodos
        grafo2.agregarNodo(A);
        grafo2.agregarNodo(B);
        grafo2.agregarNodo(C);
        grafo2.agregarNodo(F);
        grafo2.agregarNodo(G);
        grafo2.agregarNodo(H);

        // Agregar aristas
        grafo2.agregarArista(A, B);
        grafo2.agregarArista(A, F);
        grafo2.agregarArista(B, C);
        grafo2.agregarArista(F, G);
        grafo2.agregarArista(G, H);
        grafo2.agregarArista(C, H);

        // Mostrar grafo 2
        System.out.println("\nGrafo 2:");
        grafo2.mostrarGrafo();

        // Calcular grados grafo 2
        grafo2.calcularGrados();
    }
    
       
}
