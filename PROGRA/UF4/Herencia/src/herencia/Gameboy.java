package herencia;

/**
 *
 * @author markml
 */
public class Gameboy extends Consola{
    
    private int pilas;
    private final boolean cable_lan = true;

    public Gameboy(int pilas, int pantalla, int capacidad,
                   boolean plegable, boolean cargador) {
        super(pantalla, capacidad, plegable, cargador);
        
        this.pilas = pilas;
    }

    public int getPilas() {
        return pilas;
    }

    public void setPilas(int pilas) {
        this.pilas = pilas;
    }
    
    @Override
    public void introducir_juego() {
        System.out.println("Introduciedo juego GBA");
    }


    @Override
    public String toString() {
        return "Gameboy utiliza " + pilas + " pilas, tiene cable lan para jugar con amigos" + 
                "una capacidad de " + super.getCapacidad() + " no es plegable y no tiene cargador";
    }
      
}
