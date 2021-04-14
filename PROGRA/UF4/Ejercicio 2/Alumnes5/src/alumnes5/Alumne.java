package alumnes5;

/**
 *
 * @author markml
 */
public class Alumne {
    private String nom;
    private int edad;
    private String curso;

   
    public Alumne(String nom, int edad, String curso) {
        this.nom = nom;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "El alumne " + nom + ", tiene " + edad + " años, y estudia " + curso;
    }
    
    
    
}
