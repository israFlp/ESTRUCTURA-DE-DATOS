
package com.mycompany.tareasemana3;


public class Estudiante {
    
     //atributos
     private int id;
     private String nombre;
     private String apellidos;
     private String direccion;
     private String[] telefonos;
     //contructor
     public Estudiante(int id, String nombre, String apellidos, String direccion, String[] telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
     
     }
       
     //metodos
     public void mostrarDatos(){
         
         System.out.println("Id"+id);
         System.out.println("Nombre:"+nombre);
         System.out.println("Apellido:"+apellidos);
         System.out.println("Direccion:"+direccion);
             
         for(int i=0;i<3;i++){
             System.out.println("Telefono:"+(i+1)+":"+telefonos[i]); 
             
         }     
          
     }
              
 }
