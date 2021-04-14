package exercicicine;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author markml
 */
public class GestioButaques {
    private ArrayList<Butaca> butacas;

    public GestioButaques() {
        this.butacas = new ArrayList<Butaca>();
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }
    
    public void añadirButacas(Butaca butaca){
        int fila = butaca.getFila();
        int seient = butaca.getSilla();        
        
        int seEncuentra = buscarButaca(fila, seient);
        
        if (seEncuentra == -1) {
            butacas.add(butaca);
        }
        else{
            System.out.println("Butaca ocupada");
        }
    }
    
    public void eliminarButaca(int fila, int seient){
        int seEncuentra = buscarButaca(fila, seient);
        
        if (seEncuentra == -1) {
            System.out.println("No se encuentra la butaca");
        }
        else{
            System.out.println("Eliminar butaca");
        }
    }
    
    public int buscarButaca(int fila, int seient){
        int posicion = -1;
        
        ListIterator<Butaca> listIte = butacas.listIterator();

         while (listIte.hasNext()){
            Butaca butacaAux = listIte.next();
            
             if (butacaAux.getFila() == fila && butacaAux.getSilla() == seient){                 
                posicion = listIte.nextIndex();
                System.out.println(listIte.nextIndex());
             }
         }    
         return posicion;
    }
}
