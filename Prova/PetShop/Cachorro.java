public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private boolean testeCinomose; 
    
    
    public Cachorro(String nome, String raca, int idade, boolean testeCinomose) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.testeCinomose = testeCinomose;
    }
    
   
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public boolean getTesteCinomose() {
        return testeCinomose;
    }
    
    public void setTesteCinomose(boolean testeCinomose) {
        this.testeCinomose = testeCinomose;
    }
}