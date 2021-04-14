/*
Crear una classe Practica_ordenador amb els següents atributs:
- Nom del PC.
- Velocitat del processador (en MHz).
- Capacitat de memòria (en MB).
- Capacitat del disc dur (en GB)
- Tamany de la pantalla (en polsades)
- Si porta lector de CD/DVD (sí o no)

Crear un constructor amb tots els paràmetres, els setters i getters respectius,
toString, equals (només es compararà el nom) i clone.

Crear una classe Principal, i al seu mètode main, 
crear 3 ordinadors diferents (amb dades indicades al programa)
i un 4rt igual al primer. Mostrar les dades per pantalla (amb toString),
comparar-los (amb equals) i clonar un ordinador 
(amb clone).
 */
package ordinador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Practica_ordenador {

    
    public static void main(String[] args) {
        try{ 

            ArrayList<Ordenador> ordenadores  = new ArrayList<Ordenador>();
            boolean igual = true;

            Ordenador ordenador  = new Ordenador("PC201", 2, 16, 255, 30, true);
            Ordenador ordenador2 = new Ordenador("PC202", 3, 16, 200, 21, false);
            Ordenador ordenador3 = new Ordenador("PC203", 4, 8, 300, 30, false);
            Ordenador ordenador4 = new Ordenador("PC201", 2, 16, 255, 30, true);
            ordenadores.add(ordenador);
            ordenadores.add(ordenador2);
            ordenadores.add(ordenador3);
            ordenadores.add(ordenador4);

            Iterator ite = ordenadores.iterator();

            while (ite.hasNext()) { 
                System.out.println(ite.next()); 
            } 
            
            
            
            System.out.println("Comparamos el ordenador 1 y el 4 por si son iguales");
            igual = ordenador.equals(ordenador4);
            if (igual) {
                System.out.println("Los ordenadores son iguales");
            }
            else{
                System.out.println("Los ordenadores no son iguales");
            }

            
            System.out.println("Clonamos el ordenador 3");
                Ordenador ordenador5 = (Ordenador)ordenador3.clone();  

                System.out.println(ordenador5.toString()); 
                ordenador5.setNom("Alfredo");

                System.out.println("Cambiamos el nombre del ordenador nuevo");
                System.out.println(ordenador3.toString());
                System.out.println(ordenador5.toString());
        }
        catch(CloneNotSupportedException c){
        }      
    }   
}
