public class Conta {

    private int numero;
    private Cliente cliente;
    private double saldo;
    
    
    public Conta(int numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void sacar(double valor) {

    }
    public void depositar(double valor) {
        
    }
    
    public void transferir(double valor, Conta destino) {
        
}
}
