public class Veiculo {
    private String placa;
    private String cor;
    private int nroPassageiros;
    private double capacidadeTanque;
    private double velMaxima;
    private double velAtual;
    private double consumoMedio;

   
    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNroPassageiros() {
        return this.nroPassageiros;
    }

    public void setNroPassageiros(int nroPassageiros) {
        this.nroPassageiros = nroPassageiros;
    }

    public double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getVelMaxima() {
        return this.velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public double getVelAtual() {
        return this.velAtual;
    }

    public void setVelAtual(double velAtual) {
        this.velAtual = velAtual;
    }

    public double getConsumoMedio() {
        return this.consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}
