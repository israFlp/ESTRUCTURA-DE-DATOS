using System;

namespace ArbolBinario
{
    // Definición del nodo del árbol
    class Nodo
    {
        public int Valor;
        public Nodo Izquierdo;
        public Nodo Derecho;

        public Nodo(int valor)
        {
            Valor = valor;
            Izquierdo = null;
            Derecho = null;
        }
    }

    class Arbol
    {
        public Nodo Raiz;

        public Arbol()
        {
            Raiz = null;
        }

        // Inserción de un nodo
        public void Insertar(int valor)
        {
            Raiz = InsertarRec(Raiz, valor);
        }

        private Nodo InsertarRec(Nodo raiz, int valor)
        {
            if (raiz == null)
            {
                raiz = new Nodo(valor);
                return raiz;
            }

            if (valor < raiz.Valor)
                raiz.Izquierdo = InsertarRec(raiz.Izquierdo, valor);
            else if (valor > raiz.Valor)
                raiz.Derecho = InsertarRec(raiz.Derecho, valor);

            return raiz;
        }

        // Recorridos
        public void Inorden(Nodo nodo)
        {
            if (nodo != null)
            {
                Inorden(nodo.Izquierdo);
                Console.Write(nodo.Valor + " ");
                Inorden(nodo.Derecho);
            }
        }

        public void Preorden(Nodo nodo)
        {
            if (nodo != null)
            {
                Console.Write(nodo.Valor + " ");
                Preorden(nodo.Izquierdo);
                Preorden(nodo.Derecho);
            }
        }

        public void Postorden(Nodo nodo)
        {
            if (nodo != null)
            {
                Postorden(nodo.Izquierdo);
                Postorden(nodo.Derecho);
                Console.Write(nodo.Valor + " ");
            }
        }

        // Búsqueda
        public bool Buscar(int valor)
        {
            return BuscarRec(Raiz, valor);
        }

        private bool BuscarRec(Nodo nodo, int valor)
        {
            if (nodo == null) return false;
            if (valor == nodo.Valor) return true;
            if (valor < nodo.Valor) return BuscarRec(nodo.Izquierdo, valor);
            else return BuscarRec(nodo.Derecho, valor);
        }

        // Eliminación de nodo
        public void Eliminar(int valor)
        {
            Raiz = EliminarRec(Raiz, valor);
        }

        private Nodo EliminarRec(Nodo raiz, int valor)
        {
            if (raiz == null) return raiz;

            if (valor < raiz.Valor)
                raiz.Izquierdo = EliminarRec(raiz.Izquierdo, valor);
            else if (valor > raiz.Valor)
                raiz.Derecho = EliminarRec(raiz.Derecho, valor);
            else
            {
                // Nodo con un solo hijo o sin hijos
                if (raiz.Izquierdo == null) return raiz.Derecho;
                if (raiz.Derecho == null) return raiz.Izquierdo;

                // Nodo con dos hijos: obtener el sucesor en orden
                raiz.Valor = MinValor(raiz.Derecho);
                raiz.Derecho = EliminarRec(raiz.Derecho, raiz.Valor);
            }

            return raiz;
        }

        private int MinValor(Nodo nodo)
        {
            int minv = nodo.Valor;
            while (nodo.Izquierdo != null)
            {
                minv = nodo.Izquierdo.Valor;
                nodo = nodo.Izquierdo;
            }
            return minv;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Arbol arbol = new Arbol();
            int opcion, valor;

            do
            {
                Console.WriteLine("\n--- Menú Árbol Binario ---");
                Console.WriteLine("1. Insertar nodo");
                Console.WriteLine("2. Recorrido Inorden");
                Console.WriteLine("3. Recorrido Preorden");
                Console.WriteLine("4. Recorrido Postorden");
                Console.WriteLine("5. Buscar nodo");
                Console.WriteLine("6. Eliminar nodo");
                Console.WriteLine("0. Salir");
                Console.Write("Seleccione una opción: ");
                opcion = int.Parse(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        Console.Write("Ingrese valor a insertar: ");
                        valor = int.Parse(Console.ReadLine());
                        arbol.Insertar(valor);
                        break;
                    case 2:
                        Console.Write("Inorden: ");
                        arbol.Inorden(arbol.Raiz);
                        Console.WriteLine();
                        break;
                    case 3:
                        Console.Write("Preorden: ");
                        arbol.Preorden(arbol.Raiz);
                        Console.WriteLine();
                        break;
                    case 4:
                        Console.Write("Postorden: ");
                        arbol.Postorden(arbol.Raiz);
                        Console.WriteLine();
                        break;
                    case 5:
                        Console.Write("Ingrese valor a buscar: ");
                        valor = int.Parse(Console.ReadLine());
                        bool encontrado = arbol.Buscar(valor);
                        Console.WriteLine(encontrado ? "Valor encontrado" : "Valor no encontrado");
                        break;
                    case 6:
                        Console.Write("Ingrese valor a eliminar: ");
                        valor = int.Parse(Console.ReadLine());
                        arbol.Eliminar(valor);
                        Console.WriteLine("Nodo eliminado si existía.");
                        break;
                    case 0:
                        Console.WriteLine("Saliendo...");
                        break;
                    default:
                        Console.WriteLine("Opción no válida.");
                        break;
                }
            } while (opcion != 0);
        }
    }
}
