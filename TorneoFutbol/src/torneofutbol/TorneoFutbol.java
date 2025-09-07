
package torneofutbol;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TorneoFutbol {
    private Map<String, Equipo> equipos;

    public TorneoFutbol() {
        equipos = new HashMap<>();
    }

    public void agregarEquipo(String nombreEquipo) {
        if (!equipos.containsKey(nombreEquipo)) {
            equipos.put(nombreEquipo, new Equipo(nombreEquipo));
            System.out.println("Equipo " + nombreEquipo + " agregado.");
        } else {
            System.out.println("El equipo ya existe.");
        }
    }

    public void agregarJugadorAEquipo(String nombreEquipo, String nombreJugador) {
        Equipo equipo = equipos.get(nombreEquipo);
        if (equipo != null) {
            boolean agregado = equipo.agregarJugador(new Jugador(nombreJugador));
            if (agregado) {
                System.out.println("Jugador " + nombreJugador + " agregado al equipo " + nombreEquipo + ".");
            } else {
                System.out.println("El jugador ya existe en el equipo.");
            }
        } else {
            System.out.println("El equipo no existe.");
        }
    }

    public void mostrarTodosLosEquipos() {
        for (Equipo equipo : equipos.values()) {
            equipo.mostrarJugadores();
        }
    }

    public static void main(String[] args) {
        TorneoFutbol torneo = new TorneoFutbol();
        Scanner sc = new Scanner(System.in);

        // Ejemplo de uso
        torneo.agregarEquipo("Equipo A");
        torneo.agregarEquipo("Equipo B");

        torneo.agregarJugadorAEquipo("Equipo A", "Jugador1");
        torneo.agregarJugadorAEquipo("Equipo A", "Jugador2");
        torneo.agregarJugadorAEquipo("Equipo B", "Jugador3");
        torneo.agregarJugadorAEquipo("Equipo B", "Jugador4");
        torneo.agregarJugadorAEquipo("Equipo A", "Jugador1"); // Intento duplicado

        System.out.println("\n----- Equipos y Jugadores -----");
        torneo.mostrarTodosLosEquipos();

        sc.close();
    }
}

    
    
