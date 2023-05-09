import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Endereco endereco1 = new Endereco("Cidade verde", "Rua A", "2438", "Vilhena", "RO", "12345-678");
        Cliente cliente1 = new Cliente("Adriani", endereco1);

        Endereco endereco2 = new Endereco("Centro", "Rua B", "4546", "Comodoro", "MT", "98765-432");
        Cliente cliente2 = new Cliente("Ciclano da Silva", endereco2);

        Conta conta1 = new Conta(1, cliente1, 1000.0);
        Conta conta2 = new Conta(2, cliente2, 2000.0);

        conta1.depositar(500.0);
        conta2.sacar(300.0);
        conta1.transferir(200.0, conta2);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
    }
}
