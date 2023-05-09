import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
      
        Endereco endereco = new Endereco("Rua A", "374", "Centro", "Vilhena", "RO", "01001-000");
        
        
        Cliente cliente = new Cliente("Adriani", 30, endereco);
        
        Cachorro cachorro = new Cachorro("Thor", "Viralata", 5, "Negativo");
        
        
        Servico servico = new Servico(cliente, "Banho", 50.0, cachorro);
        
        
        System.out.println("Cliente: " + servico.getCliente().getNome());
        System.out.println("Animal: " + servico.getAnimal().getNome());
        System.out.println("Descrição do serviço: " + servico.getDescricao());
        System.out.println("Valor: R$ " + servico.getValor());
    }
}
