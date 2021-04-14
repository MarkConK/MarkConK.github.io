/*
 * 

Se li ha de preguntar a l’usuari quants membres de la familia vol introduïr.
L'adreça de tots els membres de la família serà sempre la mateixa, 
amb el que aquesta dada només es demanarà una sola vegada 
i si canvia l'adreça d'un familiar, això afectarà a la resta de la família.
Visualitza les dades de tots els membres de la família.
Posteriorment, la família canvia d'adreça
amb el que el programa demanarà aquesta nova adreça.
Tornar a visualitzar les dades de tots els membres de la família
amb la finalitat de comprovar que el canvi d'adreça ha afectat a tots els membres. 
Per últim, es visualitzarà la mitja d'edat de la família.
open the template in the editor.
 */
package ejercicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        int familiares  = 0;
        int edad        = 0;
        String nom      = "";
        String adresa   = "";  
        int edad_aux    = 0;
        ArrayList<Miembro> miembros = new ArrayList<Miembro>(); 
        Miembro miem;
        
        System.out.println("Cuantos miembros hay en las familia? ");
        Scanner scan   = new Scanner(System.in);       
        familiares     = scan.nextInt();
        
        System.out.println("Cual es la direccion de la vivienda? ");
        Scanner scans = new Scanner(System.in);
        adresa        = scans.nextLine();
        //pedimos datos de los miembros y los guardamos
        
        for (int i = 1; i < (familiares + 1); i++) {
            System.out.println("Introduce el nombre del familiar " + i);
            nom  = scans.nextLine();
            
            System.out.println("Introduce la edad del familiar");
            edad = scan.nextInt();
            
            miem = new Miembro(nom, edad, adresa);
            miembros.add(miem);
        }
        mostrar(miembros);   
        
        
        System.out.println("Cambiamos la direccion");
        System.out.println("Introduce la nueva direccion");
        Scanner scan2 = new Scanner(System.in);
        String neu_adresa  = scan2.nextLine();
        
        for (int i = 0; i < familiares; i++) {
           miembros.get(i).setAdresa(neu_adresa);
        }
        
        mostrar(miembros);
        
        System.out.println("La edad media de la familia es de: ");
        for (int i = 0; i < familiares; i++) {
            edad_aux =  edad_aux + miembros.get(i).getEdad();
        }
        System.out.println(edad_aux/2);
      
    }
    
    public static void mostrar(ArrayList<Miembro> miembros){
        Iterator ite = miembros.iterator();

        while (ite.hasNext()) { 
            System.out.println(ite.next() + " "); 
        } 
    }
    
}
