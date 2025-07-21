
package parquediversiones;


public class Persona {
    private String nombre;
    private int numero;

    public Persona(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + ". " + nombre;
    }
    
}
