package herencia;
/**
 *
 * @author markml
 */
public class Switch extends Consola {
    
    private int joystick;

    public Switch(int joystick, int pantalla, int capacidad, 
                  boolean plegable, boolean cargador) {
        super(pantalla, capacidad, plegable, cargador);
        
        this.joystick = joystick;
    }

    public int getJoystick() {
        return joystick;
    }

    public void setJoystick(int joystick) {
        this.joystick = joystick;
    }
       
    @Override
    public void introducir_juego() {
        System.out.println("Introduciendo juego Switch");
    }
    
    @Override
    public String toString() {
        return "Switch tiene " + joystick + " joysticks, tiene " + super.getPantalla() + 
               " pantallas y una capacidad de " + super.getCapacidad() + " no es plegable y tiene cargador";
    }        
  
}
