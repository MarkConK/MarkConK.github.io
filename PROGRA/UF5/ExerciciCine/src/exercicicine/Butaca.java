package exercicicine;
/**
 *
 * @author markml
 */
public class Butaca {
    
    private int fila;
    private int silla;
    private String persona;

    public Butaca(int fila, int silla, String persona) {
        this.fila = fila;
        this.silla = silla;
        this.persona = persona;
    }

    public int getFila() {
        return fila;
    }

    public int getSilla() {
        return silla;
    }

    public String getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Butaca " + " fila " + fila + ", silla " + silla + ", persona " + persona;
    }
    
    
}
