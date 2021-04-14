/*
 5.- Escriu un programa que demani les dades dels membres d'una família.
Les dades que ens interessa són:
- Nom
- Edat
- Adreça
 */
package ejercicio;

/**
 *
 * @author markml
 */
public class Miembro {
    private String nom;
    private int edad;
    private String Adresa;

    public Miembro(String nom, int edad, String Adresa) {
        this.nom = nom;
        this.edad = edad;
        this.Adresa = Adresa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return "El Miembro de la familia " 
               + nom + ", tiene " + edad + ", años y vive en " + Adresa;
    }

    public void setAdresa(String Adresa) {
        this.Adresa = Adresa;
    }
    
    
    
    
    
    
    
}
