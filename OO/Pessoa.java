public class Pessoa {
    private String Nome;
    private Pessoa Pai;
    private Pessoa Mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.Nome = nome;
        this.Pai = pai;
        this.Mae = mae;
    }

    public Pessoa(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public Pessoa getPai() {
        return this.Pai;
    }

    public Pessoa getMae() {
        return this.Mae;
    }

    public boolean verificarIrmao(Pessoa pessoa) {
        if (this.Pai == pessoa.getPai() && this.Mae == pessoa.getMae()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Pessoa pai = new Pessoa("João");
        Pessoa mae = new Pessoa("Maria");
        Pessoa filho1 = new Pessoa("Pedro", pai, mae);
        Pessoa filho2 = new Pessoa("Ana", pai, mae);

        if (filho1.verificarIrmao(filho2)) {
            System.out.println(filho1.getNome() + " e " + filho2.getNome() + " são irmãos/irmãs.");
        } else {
            System.out.println(filho1.getNome() + " e " + filho2.getNome() + " não são irmãos/irmãs.");
        }
    }
}
