/*
Crear una classe Ordinador amb els següents atributs:
- Nom del PC.
- Velocitat del processador (en MHz).
- Capacitat de memòria (en MB).
- Capacitat del disc dur (en GB)
- Tamany de la pantalla (en polsades)
- Si porta lector de CD/DVD (sí o no)
 */
package ordinador;

import java.util.Objects;


public class Ordenador implements Cloneable{
    
    private String nom;
    private int velocidad;
    private int memoria;
    private int disc_dur;
    private int tamaño_pantalla;
    private boolean cd;

    public Ordenador(String nom, int velocidad, int memoria, int disc_dur, int tamaño_pantalla, boolean cd) {
        this.nom = nom;
        this.velocidad = velocidad;
        this.memoria = memoria;
        this.disc_dur = disc_dur;
        this.tamaño_pantalla = tamaño_pantalla;
        this.cd = cd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDisc_dur() {
        return disc_dur;
    }

    public void setDis_dur(int disc_dur) {
        this.disc_dur = disc_dur;
    }

    public int getTamaño_pantalla() {
        return tamaño_pantalla;
    }

    public void setTamaño_pantalla(int tamaño_pantalla) {
        this.tamaño_pantalla = tamaño_pantalla;
    }

    public boolean isCd() {
        return cd;
    }

    public void setCd(boolean cd) {
        this.cd = cd;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nom);
        hash = 23 * hash + this.velocidad;
        hash = 23 * hash + this.memoria;
        hash = 23 * hash + this.disc_dur;
        hash = 23 * hash + this.tamaño_pantalla;
        hash = 23 * hash + (this.cd ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual = true;
        
        if (this == obj) {
            igual = true;
        }
        if (obj == null) {
            igual = false;
        }
        if (getClass() != obj.getClass()) {
            igual = false;
        }
        final Ordenador other = (Ordenador) obj;
        if (this.velocidad != other.velocidad) {
            igual = false;
        }
        if (this.memoria != other.memoria) {
            igual = false;
        }
        if (this.disc_dur != other.disc_dur) {
            igual = false;
        }
        if (this.tamaño_pantalla != other.tamaño_pantalla) {
            igual = false;
        }
        if (this.cd != other.cd) {
            igual = false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            igual = false;
        }
        return igual;
    }
    
    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
    } 
    
    @Override
    public String toString() {
        return "El Ordenador " + nom + ", con una velocidad de procesador de " + velocidad + 
                " MHz, y una memoria de " + memoria + " GB, un disco duro de " + disc_dur + 
                " GB, el tamaño de la pantalla es de " + tamaño_pantalla + 
                " pulgadas, CD/DVD = " + cd;
    }  
}
