package ejercicio6;

import java.util.ArrayList;

/**
 *
 * @author markml
 */
public class Familia {
    
   private ArrayList<Miembro> miembros;

    public Familia(ArrayList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public Familia() {
    }

    public ArrayList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Miembro> miembros) {
        this.miembros = miembros;
    }
    
    @Override
    public String toString() {
        return "Familia{" + "miembros=" + miembros + '}';
    }
   
   
}
