package alumnes;
/**
 *
 * @author markml
 */
public class Alumne {
    
    private String nombre;
    private int edad;

    public Alumne(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El alumne " + nombre + ", tiene " + edad + " años";
    }  
}
