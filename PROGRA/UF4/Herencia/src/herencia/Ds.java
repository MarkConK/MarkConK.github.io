package herencia;
/**
 *
 * @author markml
 */
public class Ds extends Consola{
    
    private final int lapiz_tactil;

    public Ds(int lapiz_tactil, int pantalla, int capacidad, 
              boolean plegable, boolean cargador) {
        super(pantalla, capacidad, plegable, cargador);
        
        this.lapiz_tactil = lapiz_tactil;
    }

    public int getLapiz_tactil() {
        return lapiz_tactil;
    }
     
    @Override
    public void introducir_juego() {
        System.out.println("Introduciendo juego GBA y DS");
    }  
    
    @Override
    public String toString() {
        return "Ds con " + lapiz_tactil + " lapiz, tiene " + super.getPantalla()+ 
               " pantallas con una capacidad de " + super.getCapacidad() +  " es plegable y tiene cargador";
    }
       
}
