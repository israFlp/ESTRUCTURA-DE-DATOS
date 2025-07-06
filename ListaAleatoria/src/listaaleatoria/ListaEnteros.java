
package listaaleatoria;


public class ListaEnteros {
    Nodo cabeza;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void eliminarFueraDeRango(int minimo, int maximo) {
        // Eliminar nodos desde el inicio si están fuera del rango
        while (cabeza != null && (cabeza.dato < minimo || cabeza.dato > maximo)) {
            cabeza = cabeza.siguiente;
        }

        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.dato < minimo || actual.siguiente.dato > maximo) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    
    
}
