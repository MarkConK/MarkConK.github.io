package herencia;
/**
 *
 * @author markml
 */
public abstract class Consola {
    
    private static boolean portable = true;
    private static int pantalla;
    private int capacidad;
    private static boolean plegable;
    private static boolean cargador;

    public Consola(int pantalla, int capacidad, boolean plegable, boolean cargador) {
        this.pantalla = pantalla;
        this.capacidad = capacidad;
        this.plegable = plegable;
        this.cargador = cargador;
    }

    public boolean isPortable() {
        return portable;
    }

    public int getPantalla() {
        return pantalla;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isPlegable() {
        return plegable;
    }

    public boolean isCargador() {
        return cargador;
    }

    public final void encender(){
        System.out.println("Estoy encendiendome");
    }
    
    public static void reproducir_musica(){
        System.out.println("Reproduciendo banda sonora del juego");
    }
    
    public static void cargar_juego(){
        System.out.println("Cargando juego");
    }
    
    public abstract void introducir_juego();
            
    @Override
    public String toString() {
        return "La consola " + portable + " tiene " + pantalla + 
               ", y una capacidad " + capacidad + ", plegable " + 
                plegable + ", cargador=" + cargador + '}';
    }    
}
