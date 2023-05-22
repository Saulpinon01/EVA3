/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class EVA3_5_CAPTURAR_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x;
        do{
            
       try{ 
       Scanner input = new Scanner(System.in);
        System.out.println("introduce el valor de x (numero entero): ");
        x = input.nextInt();
        break;
       }catch(InputMismatchException e){
           System.out.println("el valor es erroneo, no se puede convertir a numero.");
       }
        }while(true);
        
        System.out.println("el valor capturado es: "+ x);
        
        
        
        
        
    }
    
}
