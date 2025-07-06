
package listaaleatoria;
import java.util.Random;
import java.util.Scanner;

public class ListaAleatoria {

    
    public static void main(String[] args) {
        ListaEnteros lista = new ListaEnteros();
        Random random = new Random();

        // Crear lista con 50 números aleatorios entre 1 y 999
        for (int i = 0; i < 50; i++) {
            lista.agregar(random.nextInt(999) + 1);
        }

        System.out.println("Lista original:");
        lista.mostrar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = scanner.nextInt();
        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        lista.eliminarFueraDeRango(minimo, maximo);

        System.out.println("Lista después de eliminar valores fuera del rango:");
        lista.mostrar();
        
    }
    
}
