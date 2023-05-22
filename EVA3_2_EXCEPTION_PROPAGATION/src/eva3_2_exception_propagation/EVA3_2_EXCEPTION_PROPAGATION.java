/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_exception_propagation;

/**
 *
 * @author saulp
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("inicia main ");
        A();
        System.out.println("termina main");
    }
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("termina A");
    }
    public static void B(){
        System.out.println("inicia B");
        C();
        System.out.println("termina B");
        
    }
    public static void C(){
        System.out.println("inicia C");
        int x = 5, y= 0;
        int result =x/y;
        System.out.println("resultado: "+result);
        System.out.println("termina C");
    }
   
}
