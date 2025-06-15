

package com.mycompany.tareasemana3;


public class TareaSemana3 {

     public static void main(String[] args) {
         /*Elabore un documento PDF que contenga la definición de las clases,
         arrays y/o matrices necesarias en C# o Java para manejar el registro      
         de un estudiante que posea los siguientes datos (id, nombres, apellidos,
         dirección y tres teléfonos )*/
         
         String [] telefonos ={"0982789438", "0968259710", "0928765278"};
        
         Estudiante estudiantes= new Estudiante(id: 1, nombre: "Israel", apellido: "Azogue", direccion: "Ambato", telefonos);
         estudiantes.mostrarDatos();
     }
}
