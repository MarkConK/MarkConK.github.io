package exercicicine;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author markml
 */
public class Cine {
    private int filas;
    private int sillas;
    private GestioButaques butaques;

    
    public Cine() {
        System.out.println("Datos del cine.");
        demanarDadesInicials();
        this.butaques = new GestioButaques();
    }

    
    public void iniciar(){
        int opcion = 0;                
        do {            
            
            menu();
            opcion = Teclat.leerInt("Que opcion quieres realizar? ");
            switch (opcion) 
            {
                case 1:  
                    
                         break;
                case 2:  
                    
                         break;
                case 3:  
                    
                         break;
                case 4:  
                         break;
                case 5:  
                         break;
                default: 
                         break;
            }
            
        } while (opcion != 0);
    }
    
    public void menu(){
        System.out.println("MENU BANCO");
        System.out.println("1-Dar alta cliente");
        System.out.println("2-Dar baja cliente");
        System.out.println("3-Dar alta cuenta");
        System.out.println("4-Dar baja cuenta");
        System.out.println("5- Ingresar dinero");
        System.out.println("0-Salir");
    }
    
    public void demanarDadesInicials(){
        int fila = introduirFila();
        int silla = introduirSeient();
        
               
    }
    
    public int introduirFila(){
        int fila = Teclat.leerInt("Introduce la fila: ");
        
        return fila;
    }
    public int introduirSeient(){
        int silla = Teclat.leerInt("Introduce la butaca: ");
        
        return silla;
        
    }
    public String introduirPersona(){
        String persona = Teclat.leerString("Introduce el nombre: ");
        
        return persona;
    }
    
    public void opcioMostrarButaques(ArrayList<Butaca> butacas){
        
        ListIterator<Butaca> listIte = butacas.listIterator();
        
            while (listIte.hasNext()){
                Butaca buta = listIte.next();
                System.out.println(buta.toString());
            }
    }
}

