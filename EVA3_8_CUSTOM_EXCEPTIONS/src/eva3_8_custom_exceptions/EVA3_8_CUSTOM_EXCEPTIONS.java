/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;



/**
 *
 * @author saulp
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DatoIncorrectoCheckedException {
        Persona perso = new Persona("x","y",1);
        perso.setNombre("saul");
        perso.setApellido("piñon");
        try{
        perso.setEdad(-8);
        }catch(DatoIncorrectoCheckedException e){
            System.out.println(e.getMessage());
        }
    }
    
}


class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    
   

    public Persona(String nombre, String apellido, int edad) throws DatoIncorrectoCheckedException {
        this.nombre = "";
        this.apellido = "";
        setEdad(edad);
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckedException {
        if (edad<0) 
         //   throw new DatoIncorrectoException();// unchecked
            throw new DatoIncorrectoCheckedException();
            
        
        this.edad = edad;
    }


}


class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {
        super("Dato incorrecto, el valor introducido no puede ser negativo");
    }
    
    
}

class DatoIncorrectoCheckedException extends Exception{

    public DatoIncorrectoCheckedException() {
          super("Dato incorrecto, el valor introducido no puede ser negativo");
    }
    
}