package herencia;
import java.util.Scanner;
/**
 *
 * @author markml
 */
public class Herencia {

    public static void main(String[] args) {
        
    Gameboy gba     = new Gameboy(4, 1, 10, false, false);
    Switch sw1  = new Switch(2, 1, 64, false, true);    
    Ds ds1          =  new Ds(1, 2, 30, true, true);
    
    System.out.println(gba.toString());
    System.out.println("---------------------------------");
    
    System.out.println(sw1.toString());
    System.out.println("Introduce de cuanto es la memoria a introducir");
    Scanner scan = new Scanner(System.in);       
    int tarjeta = scan.nextInt();
    
    sw1.setCapacidad(tarjeta);
       
    System.out.println(sw1.toString());
    
    System.out.println("---------------------------------");
    System.out.println(ds1.toString());
    
        
    }
    
}
