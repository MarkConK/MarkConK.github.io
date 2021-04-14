package repte_cuenta;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
   
    public Cliente(String nombre, String apellido, ArrayList<Cuenta> cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
   
    @Override
    public String toString() {
        return "Cliente " + nombre + " " + apellido + " tiene la " + cuentas;
    }   
}
