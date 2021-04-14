package repte_cuenta;

public class Cuenta {
   
    private int num_cuenta;
    private int saldo;

    public Cuenta(int num_cuenta, int saldo) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    public int ingresar(int ingreso){
        int ingresar = 0;
        
        ingresar = this.saldo + ingreso;
        
        return ingresar;
    }
    
    public int retirar(int retirar){
        int retirado = 0;
        
        retirado = this.saldo - retirar;
        
        return retirado;     
    }

    @Override
    public String toString() {
        return "Cuenta con el numero " + num_cuenta + " y un saldo de " + saldo;
    }
    
    
}
