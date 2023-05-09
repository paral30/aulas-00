public class Gato {
    private String nome;
    private String raca;
    private int idade;
    private boolean testeFivFelv; 
    
    
    public Gato(String nome, String raca, int idade, boolean testeFivFelv) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.testeFivFelv = testeFivFelv;
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
    
    public boolean getTesteFivFelv() {
        return testeFivFelv;
    }
    
    public void setTesteFivFelv(boolean testeFivFelv) {
        this.testeFivFelv = testeFivFelv;
    }
}