/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_read_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saulp
 */
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String ruta = "C:\\Archivos\\prueba.txt";
            readUsingFiles(ruta);
        } catch (IOException ex) {
            ex.printStackTrace(); // imprimir excepcion
        }


      // files -----> lee el archivo y lo carga en la memoria principal
      // por lo tanto solo sirve para archivos pequeños

    }
    
    public static void readUsingFiles(String ruta) throws IOException{
        // recibimos en formato de texto y la convertimos en formato de path
        Path path = Paths.get(ruta);
        Files.readAllLines(path);
        
       /* List<String> contenidoArch = Files.readAllLines(path);
        //System.out.println(contenidoArch.toString());
        for (int i = 0; i < contenidoArch.size(); i++) {
            System.out.println(contenidoArch.get(i)); 
            
        }*/
       
       byte [] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String (arregloBytes));
    }
    
}
