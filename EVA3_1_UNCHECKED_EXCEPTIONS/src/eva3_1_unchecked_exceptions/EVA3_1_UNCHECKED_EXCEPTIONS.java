/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ARITHMETIC EXCEPTION : DIVISION ENTRE CERO
        
        System.out.println("iniciando el programa");
        System.out.println("declarando variables");
        int x = 5, y = 0;
        System.out.println("intentar division");
        int result = x / y; // aqui se genera la excepsion si no se resuelve el programa termina
        System.out.println("resultado "+ result);
        
       Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero");
        int nume = input.nextInt();// si el usuario captura una cadena 
                                   // que no puede convertirse en numero 
                                   // se produce una excepcion y termina el programa
        System.out.println("el numero es: "+ nume);
       
       //arraysindexoutfbounds exception 
       int[] arreglo = new int[5];
       arreglo[0] = 100;
       arreglo[1] = 200;
       arreglo[2] = 300;
       arreglo[3] = 400;
       arreglo[4] = 500;
       arreglo[5] = 600; 
       
       // nullpointerexception
       
       Prueba pruebaobj = null;
        System.out.println("valor de x = "+pruebaobj.x);
        
        // no puedo leer la x porque el objeto no existe 
    }
    
}

class Prueba{
  int x = 100;
}