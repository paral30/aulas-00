public class Servico {
    private Cliente cliente;
    private Animal animal;
    private String descricao;
    private double valor;

    public Servico(Cliente cliente, Animal animal, String descricao, double valor) {
        this.cliente = cliente;
        this.animal = animal;
        this.descricao = descricao;
        this.valor = valor;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
