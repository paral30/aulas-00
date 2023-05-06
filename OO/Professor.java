public class Professor {
    private int codigo;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private int cargaHoraria;
    private Conta conta;

    
    public int getCodigo() {
        return  this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return  this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return  this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return  this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCargaHoraria() {
        return  this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Conta getConta() {
        return  this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}