/*
Escriu un programa que demani les dades de 5 alumnes que estan matriculats en una escola. 
Aquesta escola té dos cursos de formació, on 3 alumnes estan
apuntats en un curs i els altres 2 en l'altre curs.

D'aquests alumnes ens interessa: nom del curs on està matriculat, nom i edat.

Com sabem que hi ha 3 alumnes matriculats en un curs i 2 en l'altre, el nom
d'aquests cursos es demanarà una sola vegada. Posteriorment, s'assignarà el 
nom d'aquests cursos als alumnes que correspongui. Per suposat, per cada alumne 
es demanarà el seu nom i edat, seguidament es visualitzarà les dades dels 5 alumnes.
*/
package alumnes5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Alumnes5 {
static final int num = 6;

    public static void main(String[] args) {
        String nom = "";
        int edad = 0;
        Alumne alu;
       
        
        ArrayList<Alumne> alumnos  = new ArrayList<Alumne>(); 
        
        for (int i = 1; i < num; i++) {
            System.out.println("Introduce el nombre del alumno " + i);
            Scanner scan = new Scanner(System.in);       
            nom = scan.nextLine();
            System.out.println("Introduce la edad");
            Scanner scan1 = new Scanner(System.in);       
            edad = scan1.nextInt();
            System.out.println("Introduce el curso en el que esta matriculado");
            String curs =  scan.nextLine();
            
            alu = new Alumne(nom, edad, curs);
            alumnos.add(alu);
        }
        
        Iterator ite = alumnos.iterator();

        while (ite.hasNext()) { 
            System.out.println(ite.next() + " "); 
        } 
        

        
    }
    
}
