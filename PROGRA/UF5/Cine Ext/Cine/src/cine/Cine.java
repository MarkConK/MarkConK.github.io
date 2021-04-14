package cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
	
	private int num_filas;
	private int num_sillas;
	//gestio butaques
	
	
	private static void iniciar(){
		
		ArrayList<Butaca> butacas = new ArrayList<Butaca>();
		int opcio = -1;
		menu();
		
		do{			
			
			switch(opcio){
				case 1:
					
					break;
				case 2:  
								              
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 0:
					break;
				default:
					System.out.println("No existe esa opcion");
					break;
			}					
		}
		while(opcio != 0);
	}
	private static void menu(){		
		
		int opcio = -1;
		try{			
			System.out.println("\nBIENVENIDOS A JOAN CINES: \n");
			System.out.println("1. Mostrar totes les butaques reservades");
			System.out.println("2. Mostrar les butaques reservades per una persona");
			System.out.println("3. Reservar una butaca");
			System.out.println("4. Anular la reserva d'una butaca");
			System.out.println("5. Anular totes les reserves d'una persona");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			opcio = new Scanner(System.in).nextInt();
		}
		catch(Exception e){
		}							
	}
	
	
	private static void demanarDadesInicials(){
		
		int filaini = Teclado.leerInt("Bienvenido, cuantas filas tendrá su cine? ");
		int sillaini = Teclado.leerInt("Cuantas butacas habrá por cada fila? ");	
	}
	
	private static void introduirFila(){
		int fila = Teclado.leerInt("Introduce la fila deseada: ");
		
	}
	
	private static void introduirSeient(){
		int silla = Teclado.leerInt("Introduce la butaca o butacas que desea: ");
	}
	
	private static void introduirPersona(){
		String persona = Teclado.leerString("Introduce tu nombre: ");
	}
	
	private static void opcioReservarButaca(){
		introduirFila();
		introduirSeient();
		introduirPersona();
	}
	
	private static void opcioMostrarButaques(){
		
	}	
	private static void opcioMostrarButaquesPersona(){
		
	}	

	private static void opcioAnularReserva(){
		
	}
	private static void opcióAnularReservaPerPersona(){
		
	}
}