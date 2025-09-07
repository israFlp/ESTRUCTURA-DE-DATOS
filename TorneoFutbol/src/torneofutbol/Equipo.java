
package torneofutbol;
import java.util.HashSet;
import java.util.Set;

public class Equipo {
    private String nombre;
    private Set<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new HashSet<>(); // Usamos HashSet para evitar duplicados
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarJugador(Jugador jugador) {
        return jugadores.add(jugador); // true si se agregó, false si ya existía
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void mostrarJugadores() {
        System.out.println("Jugadores del equipo " + nombre + ":");
        for (Jugador j : jugadores) {
            System.out.println("- " + j);
        }
    }
    
}
