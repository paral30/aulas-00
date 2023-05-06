public class Curso {
    private String nome;
    private int cargaHoraria;
    private Professor coordenador;
    private int codigo;

   
    public String getNome() {
        return  this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return  this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getCoordenador() {
        return  this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public int getCodigo() {
        return  this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}