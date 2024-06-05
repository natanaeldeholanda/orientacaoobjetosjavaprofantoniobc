package unidade04;

/*
 * Autor: Natanael de Holanda
 * Versão: 1.0
 * Descrição: Classe que representa o Servidor Público
 */


public class Curso {
    //Inserindo Atributos
    private int idcurso;
    private String nome;
    private String formarealizacao;
    private String ofertante;
    private double valor;

    public Curso(){

    }

    public Curso(int idcurso, String nome, String formarealizacao, String ofertante, double valor) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.formarealizacao = formarealizacao;
        this.ofertante = ofertante;
        this.valor = valor;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormarealizacao() {
        return formarealizacao;
    }

    public void setFormarealizacao(String formarealizacao) {
        this.formarealizacao = formarealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idcurso=" + idcurso +
                ", nome='" + nome + '\'' +
                ", formaRealizacao='" + formarealizacao + '\'' +
                ", ofertante='" + ofertante + '\'' +
                ", valor=" + valor +
                '}';
    }
}
