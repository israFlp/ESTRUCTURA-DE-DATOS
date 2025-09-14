using System;
using System.Collections.Generic;

namespace CatalogoRevistas
{
    class Program
    {
        // Lista de títulos de revistas
        static List<string> catalogo = new List<string>
        {
           "National Geographic",
            "Time",
            "Forbes",
            "Scientific American",
            "Nature",
            "The Economist",
            "Sports Illustrated",
            "Vogue",
            "People",
            "Reader's Digest"
        };

        static void Main(string[] args)
        {
            int opcion;
            do
            {
                Console.Clear();
                Console.WriteLine("===== Catálogo de Revistas =====");
                Console.WriteLine("1. Buscar revista");
                Console.WriteLine("2. Mostrar catálogo");
                Console.WriteLine("3. Salir");
                Console.Write("Seleccione una opción: ");
                
                if (!int.TryParse(Console.ReadLine(), out opcion))
                {
                    Console.WriteLine("⚠️ Ingrese un número válido.");
                    Console.ReadKey();
                    continue;
                }

                switch (opcion)
                {
                    case 1:
                        BuscarRevista();
                        break;
                    case 2:
                        MostrarCatalogo();
                        break;
                    case 3:
                        Console.WriteLine("Saliendo del programa...");
                        break;
                    default:
                        Console.WriteLine("⚠️ Opción inválida.");
                        break;
                }

                if (opcion != 3)
                {
                    Console.WriteLine("\nPresione una tecla para continuar...");
                    Console.ReadKey();
                }

            } while (opcion != 3);
        }

        /// <summary>
        /// Método que solicita un título al usuario y lo busca en el catálogo.
        /// </summary>
        static void BuscarRevista()
        {
            Console.Write("\nIngrese el título de la revista a buscar: ");
            string titulo = Console.ReadLine();

            bool encontrado = BuscarRecursivo(catalogo, titulo, 0);

            if (encontrado)
                Console.WriteLine($"✅ Revista \"{titulo}\" encontrada en el catálogo.");
            else
                Console.WriteLine($"❌ Revista \"{titulo}\" no encontrada.");
        }

        /// <summary>
        /// Búsqueda recursiva en la lista de revistas.
        /// </summary>
        /// <param name="lista">Lista de revistas</param>
        /// <param name="titulo">Título buscado</param>
        /// <param name="indice">Posición actual</param>
        /// <returns>True si se encuentra, False si no</returns>
        static bool BuscarRecursivo(List<string> lista, string titulo, int indice)
        {
            // Caso base: se recorrió toda la lista
            if (indice >= lista.Count)
                return false;

            // Comparación ignorando mayúsculas/minúsculas
            if (lista[indice].Equals(titulo, StringComparison.OrdinalIgnoreCase))
                return true;

            // Llamada recursiva al siguiente índice
            return BuscarRecursivo(lista, titulo, indice + 1);
        }

        /// <summary>
        /// Método que imprime el catálogo completo.
        /// </summary>
        static void MostrarCatalogo()
        {
            Console.WriteLine("\n📚 Catálogo de Revistas:");
            foreach (var revista in catalogo)
            {
                Console.WriteLine($"- {revista}");
            }
        }
    }
}
