/*
Escriu un programa que demani les dades a tres alumnes. 
D'aquests 3 alumnes ens interessa: nom i edat.
Sabem que aquests alumnes tenen la mateixa edat.
Aquesta dada es demanarà una sola vegada i 
per assignar-li a cadascun dels alumnes utilitzarem el mètode corresponent. 
Per això demanarem l'edat en el main i  li enviarem a  cada objecte.
Posteriorment, el programa visualitzarà les dades dels tres alumnes.
*/

package alumnes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Alumnes {
    
    static final int personas = 4;
    
    public static void main(String[] args) {
                
        
       ArrayList<Alumne> alumnos  = new ArrayList<Alumne>(); 
        
        System.out.println("Introduce la edad de los alumnos.");
        Scanner scan = new Scanner(System.in);       
        int edad = scan.nextInt();
        String nom;
        
               
        for (int i = 1; i < personas; i++) {
            System.out.println("Introduce el nombre del alumno " + i);
            Scanner scan1 = new Scanner(System.in);       
            nom = scan1.nextLine();
            
            Alumne alu =  new Alumne(nom);
            alu.setEdad(edad);
            alumnos.add(alu);       
        }
        
        
        Iterator ite = alumnos.iterator();

        while (ite.hasNext()) { 
            System.out.println(ite.next() + " "); 
        } 
    }
        
}
    
