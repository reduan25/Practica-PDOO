/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carbuy;

/**
 *
 * @author Usuario
 */
public class CarBuy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche("Opel", "Zafira", 2013, 16340.0);
        Coche c3 = new Coche(c1);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    
    
}
