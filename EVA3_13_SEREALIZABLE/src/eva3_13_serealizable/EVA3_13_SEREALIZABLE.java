/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_serealizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_13_SEREALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String ruta = "C:\\Archivos\\archivosObjetos.per";
            Persona perso = new Persona("juan","perez",20);
            // guardar en el archivo
            guardarObj(perso, ruta);
            // leer desde el archivo
            guardarObj(perso,ruta);
            try {
                perso = leerObj(ruta);
                System.out.println("nombre "+perso.getNombre());
            System.out.println("apellido "+perso.getApellido());
            System.out.println("edad "+perso.getEdad());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EVA3_13_SEREALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_SEREALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void guardarObj(Persona perso,String ruta) throws IOException{
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream);          
        ooStream.writeObject(perso);
        ooStream.close();
    }
    public static Persona leerObj(String ruta) throws IOException, ClassNotFoundException{
       Persona perso = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream);
        perso = (Persona)oiStream.readObject();
        return perso;
        
    }
}

class Persona implements Serializable{
     private String nombre;
     private String apellido;

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

    public void setEdad(int edad) {
        this.edad = edad;
    }
     private int edad;

    public Persona() {
        
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }
     

}
