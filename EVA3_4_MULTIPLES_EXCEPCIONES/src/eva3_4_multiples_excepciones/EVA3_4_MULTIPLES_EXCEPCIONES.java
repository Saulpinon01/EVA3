/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y;
        do{
            
        
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("introduce el valor de x (numero entero): ");
        x = input.nextInt();
        System.out.println("introduce el valor de y (numero entero): ");
        y = input.nextInt();
        
        
        int resultado = x/y;
        
        System.out.println("resultado de " + x + "/" + y + ": "+resultado);
        break;
        }catch (InputMismatchException e){
            System.out.println("captura en formato incorrecto, no se puede convertir a numero.");
            
        }
        
        
    
        
        catch(ArithmeticException e){
            System.out.println("no se puede dividir entre cero.");
            
        }
        
        }while(false);
        System.out.println("programa terminado exitosamente.");
        
    }
    
}
