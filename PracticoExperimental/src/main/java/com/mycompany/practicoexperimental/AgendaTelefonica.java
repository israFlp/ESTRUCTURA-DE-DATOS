
package com.mycompany.practicoexperimental;


public class AgendaTelefonica {
  
     /*Registro: para representar cada contacto
        Vector: almacenar los contactos de los registros*/
    
     //Atributos
     public Contacto[] contactos;
     public int totalContactos;
     //constructor

    public AgendaTelefonica(int capacidad) {
        contactos= new Contacto[capacidad];
        totalContactos=0;
        
    }
     
    //Agregar Contactos
    public boolean agregarContacto(String nombre,String telefono, String correo){
    
        if(totalContactos>=contactos.length){
        
            return false;
        } else{
        contactos[totalContactos]=new Contacto(nombre, telefono, correo);
        totalContactos=totalContactos+1;
        return true;
        }
            
    }
     
    //mostrar contactos
    
    public void mostrarContactos(){
    
        if(totalContactos==0){
        
        
            System.out.println("No tienes registros");
         }else{
        
            for(int i=0;i<totalContactos;i++){
            Contacto c=contactos[i];
                System.out.println("Datos del contato"+(i+1));
                System.out.println("Nombre:"+c.nombre());
                System.out.println("Telefono:"+c.telefono());
                System.out.println("Correo:"+c.correo());
            }
        }
        
                        
         
    }
     
     //buscar mi contacto nombre
    public Contacto buscarPorNombre(){
    
    return null;    
    }
}
