package cine;

public class Butaca {	
	private int num_fila;
	private int num_silla;
	private String persona;
	

	public Butaca(int num_fila, int num_silla, String persona) {
		this.num_fila = num_fila;
		this.num_silla = num_silla;
		this.persona = persona;
	}

	public int getNum_fila() {
		return num_fila;
	}

	public int getNum_silla() {
		return num_silla;
	}

	public String getPersona() {
		return persona;
	}

	@Override
	public String toString() {
		return "Fila " + num_fila + ",su numero es" + num_silla + ""
				+ "la tiene reservada" + persona;
	}	
}
