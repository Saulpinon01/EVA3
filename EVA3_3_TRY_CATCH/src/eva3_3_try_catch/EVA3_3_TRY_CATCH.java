/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author saulp
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 try{
    int x = 5, y = 0;
    int result = x/y;
        System.out.println("resultado: "+result);      
 }
 catch(ArithmeticException e){ // se genera un objeto exception llamado "E" de tipo ArithmeticException
System.out.println("se produjo un error:"+e.getMessage());     
 }
 System.out.println("programa terminado.");

    }
    
}
