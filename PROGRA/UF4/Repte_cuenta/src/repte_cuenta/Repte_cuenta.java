package repte_cuenta;
import java.util.ArrayList;
import java.util.ListIterator;

public class Repte_cuenta {

    public static void main(String[] args) {
        
        ArrayList<Cliente> arrayClientes = new ArrayList<Cliente>();
        
        
        int opcion = 0;                
        do {            
            menu();
            opcion = Teclado.leerInt("Que opcion quieres realizar? ");
            switch (opcion) 
            {
                case 1:  
                    alta_Cliente(arrayClientes);
                         break;
                case 2:  
                    baja_Cliente(arrayClientes);
                         break;
                case 3:  
                    alta_Cuenta(arrayClientes);
                         break;
                case 4:  
                         break;
                case 5:  
                         break;
                case 6:  
                         break;
                case 7:  
                    mostrar_Clientes(arrayClientes);
                         break;
                default: 
                         break;
            }
            
        } while (opcion != 0);
                    
    }
   
    public static void menu(){
        
        System.out.println("MENU BANCO");
        System.out.println("1-Dar alta cliente");
        System.out.println("2-Dar baja cliente");
        System.out.println("3-Dar alta cuenta");
        System.out.println("4-Dar baja cuenta");
        System.out.println("5- Ingresar dinero");
        System.out.println("6-Retirar dinero");
        System.out.println("7- Mostrar");
        System.out.println("0-Salir");
    }
        
    public static void alta_Cliente(ArrayList<Cliente> arrayClientes){
        int posicion_cliente = 0;
        System.out.println("Vamos a darte de alta en el sistema. ");
        do {
            String nombre = Teclado.leerString("Como se llama? ");
            String apellido = Teclado.leerString("Cual es su apellido? ");
            posicion_cliente = buscar_Cliente(arrayClientes, nombre, apellido);            
            if (posicion_cliente != -1) {
                System.out.println("Este cliente ya existe");
            }
            else{
                Cliente client = new Cliente(nombre, apellido);
                arrayClientes.add(client);
            }
        } 
        while (posicion_cliente == 0);        
    }

    public static void mostrar_Clientes(ArrayList<Cliente> arrayClientes){
        ListIterator<Cliente> listIte = arrayClientes.listIterator();
        
            while (listIte.hasNext()){
                Cliente f = listIte.next();
                System.out.println(f.toString());
            }
    }   
    
    public static int buscar_Cliente(ArrayList<Cliente> arrayClientes, String nom, String ape){       
        int posicion = -1;
        
        ListIterator<Cliente> listIte = arrayClientes.listIterator();

         while (listIte.hasNext()){
            Cliente f = listIte.next();
            
             if (f.getNombre().equals(nom) && f.getApellido().equals(ape)){                 
                posicion = listIte.nextIndex();
                System.out.println(listIte.nextIndex());
             }
         }    
         return posicion;
    }
    
    public static void alta_Cuenta(ArrayList<Cliente> arrayClientes){
        int posicion_cliente = 0;
        ArrayList<Cuenta> arrayCuentas = new ArrayList<Cuenta>();
        
        System.out.println("Vamos a crear una cuenta a tu nombre. ");
        do {
            String nombre = Teclado.leerString("Como se llama? ");
            String apellido = Teclado.leerString("Cual es su apellido? ");
            posicion_cliente = buscar_Cliente(arrayClientes, nombre, apellido);    
            
            if (posicion_cliente != -1) {
               int num_cuenta = Teclado.leerInt("Introduce tu numero de cuenta: ");
               int saldo = Teclado.leerInt("Introduce un saldo: ");
               
               Cuenta cuenta = new Cuenta(num_cuenta, saldo); 
               arrayCuentas.add(cuenta);
               
               arrayClientes.get(posicion_cliente - 1).setCuentas(arrayCuentas);
            }
            else{
                System.out.println("Este cliente no existe");
            }
        } 
        while (posicion_cliente == 0);
    }
    
    public static void baja_Cliente(ArrayList<Cliente> arrayClientes){
        
        String nom = Teclado.leerString("Introduce tu nombre: ");
        String ape = Teclado.leerString("Introduce el apellido: ");
        
        ListIterator<Cliente> listIte = arrayClientes.listIterator();

         while (listIte.hasNext()){
            Cliente f = listIte.next();
            
            if (f.getNombre().equals(nom) && f.getApellido().equals(ape)){                 
               arrayClientes.remove(f);
               System.out.println("Borrado completado. Hasta pronto. ");
            }
         }  
         System.out.println("No te hemos encontrado en el sistema");       
    }
}

