
package invertir.una.lista.enlazada;


public class InvertirLista {

    public static void main(String[] args) {
        
         ListaEnlazada lista = new ListaEnlazada();

         // Agregar elementos a la lista
         for (int i = 1; i <= 10; i++) {
            lista.agregar(i);
         }

         System.out.println("Lista original:");
         lista.mostrar();

         lista.invertir();

         System.out.println("Lista invertida:");
         lista.mostrar();
    } 
        
   
 }
