import java.util.*;
import java.io.*;

public class GestorVacunacion {
    // Generar ciudadanos
    public Set<String> generarCiudadanos(int cantidad) {
        Set<String> ciudadanos = new HashSet<>();
        for (int i = 1; i <= cantidad; i++) {
            ciudadanos.add("Ciudadano" + i);
        }
        return ciudadanos;
    }

    // Generar vacunados de manera aleatoria
    public Set<String> generarVacunados(Set<String> todos, int cantidad) {
        List<String> lista = new ArrayList<>(todos);
        Collections.shuffle(lista);
        return new HashSet<>(lista.subList(0, cantidad));
    }

    // Ciudadanos que no se han vacunado
    public Set<String> obtenerNoVacunados(Set<String> todos, Set<String> pfizer, Set<String> astrazeneca) {
        Set<String> resultado = new HashSet<>(todos);
        resultado.removeAll(pfizer);
        resultado.removeAll(astrazeneca);
        return resultado;
    }

    // Ciudadanos con ambas dosis
    public Set<String> obtenerAmbasDosis(Set<String> pfizer, Set<String> astrazeneca) {
        Set<String> resultado = new HashSet<>(pfizer);
        resultado.retainAll(astrazeneca);
        return resultado;
    }

    // Solo Pfizer
    public Set<String> obtenerSoloPfizer(Set<String> pfizer, Set<String> astrazeneca) {
        Set<String> resultado = new HashSet<>(pfizer);
        resultado.removeAll(astrazeneca);
        return resultado;
    }

    // Solo AstraZeneca
    public Set<String> obtenerSoloAstraZeneca(Set<String> pfizer, Set<String> astrazeneca) {
        Set<String> resultado = new HashSet<>(astrazeneca);
        resultado.removeAll(pfizer);
        return resultado;
    }

    // Imprimir resultados en consola
    public void imprimirResultados(Set<String> noVacunados, Set<String> ambasDosis,
                                   Set<String> soloPfizer, Set<String> soloAstra) {
        System.out.println("=== RESULTADOS CAMPAÑA DE VACUNACIÓN ===");
        System.out.println("No vacunados: " + noVacunados.size());
        System.out.println("Ambas dosis: " + ambasDosis.size());
        System.out.println("Solo Pfizer: " + soloPfizer.size());
        System.out.println("Solo AstraZeneca: " + soloAstra.size());
    }

    // Guardar resultados en archivo
    public void guardarResultados(String archivo, Set<String> noVacunados,
                                  Set<String> ambasDosis, Set<String> soloPfizer, Set<String> soloAstra) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            pw.println("=== RESULTADOS CAMPAÑA DE VACUNACIÓN ===");
            pw.println("\nNo vacunados (" + noVacunados.size() + "): " + noVacunados);
            pw.println("\nAmbas dosis (" + ambasDosis.size() + "): " + ambasDosis);
            pw.println("\nSolo Pfizer (" + soloPfizer.size() + "): " + soloPfizer);
            pw.println("\nSolo AstraZeneca (" + soloAstra.size() + "): " + soloAstra);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}