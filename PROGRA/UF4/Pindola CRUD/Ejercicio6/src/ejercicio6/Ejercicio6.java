package ejercicio6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
/**
 *
 * @author markml
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Familia> familiasFam = new ArrayList<Familia>();
           
        System.out.println("Cuantas familias vas a introducir?");
        Scanner scan = new Scanner(System.in);       
        int familias  = scan.nextInt();
               
        for (int j = 1; j < familias + 1; j++) {
            System.out.println("Cuantos meimbros tienen la familia " + j + "?");
            int miembros = scan.nextInt();

            ArrayList<Miembro> miembrosFam = new ArrayList<Miembro>();
            
            for (int i = 1; i < miembros + 1; i++) {
                System.out.println("Como se llama el miembro " + i + " de la familia " + j + "?");
                Scanner scan1 = new Scanner(System.in);               
                String nombre = scan1.nextLine();
                
                System.out.println("Cuantos años tiene?");
                int edad = scan.nextInt(); 	

                Miembro miem = new Miembro(nombre, edad);			
                miembrosFam.add(miem);
            } 
                       
            Familia fam = new Familia(miembrosFam);
            
            familiasFam.add(fam);
        }   
        
        mostrarFamilias(familiasFam);
        
    }
    private static void mostrarFamilias(ArrayList<Familia> familiasFam){       
        ListIterator<Familia> listIte = familiasFam.listIterator();
        
        while (listIte.hasNext()){
            Familia f = listIte.next();
            System.out.println(f.toString());
        }
    }   
}
