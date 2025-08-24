import java.util.Set;



public class CampaniaVacunacion {

    public static void main(String[] args) {
        GestorVacunacion gestor = new GestorVacunacion();

        // Crear ciudadanos
        Set<String> todos = gestor.generarCiudadanos(500);

        // Generar vacunados
        Set<String> pfizer = gestor.generarVacunados(todos, 75);
        Set<String> astrazeneca = gestor.generarVacunados(todos, 75);

        // Calcular conjuntos
        Set<String> noVacunados = gestor.obtenerNoVacunados(todos, pfizer, astrazeneca);
        Set<String> ambasDosis = gestor.obtenerAmbasDosis(pfizer, astrazeneca);
        Set<String> soloPfizer = gestor.obtenerSoloPfizer(pfizer, astrazeneca);
        Set<String> soloAstra = gestor.obtenerSoloAstraZeneca(pfizer, astrazeneca);

        // Mostrar resultados
        gestor.imprimirResultados(noVacunados, ambasDosis, soloPfizer, soloAstra);

        // Guardar resultados en archivo
        gestor.guardarResultados("reporte.txt", noVacunados, ambasDosis, soloPfizer, soloAstra);
    }
}