/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author markml
 */
public class Miembro {
    
    private String nom;
    private int edad;

    public Miembro(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
                   
    }

    @Override
    public String toString() {
        return "El Miembro de la familia " 
               + nom + ", tiene " + edad + ", años";
    }
}
