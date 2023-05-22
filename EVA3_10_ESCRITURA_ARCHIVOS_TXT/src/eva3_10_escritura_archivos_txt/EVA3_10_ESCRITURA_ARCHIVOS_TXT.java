
package eva3_10_escritura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saulp
 */
public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String ruta = "C:\\Archivos\\";
            writeUsingFiles(ruta,"prueba de escritura de archivos usando clase files");
            writeUsingFilesWriter(ruta,"prueba de escritura de archivos usando clase files");
            writeUsingBufferedFiles(ruta,"prueba de escritura de archivos usando clase files");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    public static void writeUsingFiles(String ruta,String datos) throws IOException{
        // si el archivo no existe lo crea 
        // si el archivo existe lo va a sobreecribir
        Path path = Paths.get(ruta + "Archivos");
        Files.write(path,datos.getBytes());
    }
    
    
    public static void writeUsingFileWtrite(String ruta,String datos) throws IOException{
        File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(datos);
        filewriter.close();
    }
    
    public static void writeUsingBufferedwriter(String ruta,String datos) throws IOException{
         Path path = Paths.get(ruta + "archivoBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter(osWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write((i+1)+ ""+datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        osWriter.close();
    }
    
}
