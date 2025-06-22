
package com.mycompany.practicoexperimental;


public class PracticoExperimental {

    public static void main(String[] args) {
       
         /*
         AGENTA TELEFONICA    
    
         Requerimientos.
         Vectores, matrices, regitros y estructuras:
         Registro: para representar cada contacto
         Vector: almacenar los contactos de los registros
         
         //Scanner*/
         
         AgendaTelefonica agenda=new AgendaTelefonica(3);
         
         String nombre="Israel Azogue";
         String telefono="0982789438";
         String correo="israelazogue@gmail.com";
         
         String nombre1="Marco Cundulle";
         String telefono1="0986785478";
         String correo1="marco04@gmail.com";
         
         String nombre2="Cristian Castro";
         String telefono2="0989425684";
         String correo2="castrocris@gmail.com";
         
         agenda.agregarContacto(nombre, telefono, correo);
         agenda.agregarContacto(nombre1, telefono1, correo1);
         agenda.agregarContacto(nombre2, telefono2, correo2);
         agenda.mostrarContactos();
         




    
    
        
     } 
}
