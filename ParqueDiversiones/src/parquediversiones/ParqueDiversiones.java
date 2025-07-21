
package parquediversiones;
import java.util.Scanner;

public class ParqueDiversiones {

   
    public static void main(String[] args) {
        ColaAtraccion cola = new ColaAtraccion();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Parque de Diversiones ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (!cola.estaLlena()) {
                        System.out.print("Ingrese el nombre de la persona: ");
                        String nombre = sc.nextLine();
                        cola.agregarPersona(nombre);
                        System.out.println("Persona agregada con éxito.");
                    } else {
                        System.out.println("Ya no hay más asientos disponibles.");
                    }
                    break;
                case 2:
                    cola.mostrarCola();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
        
    }
    
}
