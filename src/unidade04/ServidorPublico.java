package unidade04;
/*
 * Autor: Natanael de Holanda
 * Versão: 1.0
 * Descrição: Classe que representa o Servidor Público
 */

import java.util.LinkedList;
import java.util.List;

public class ServidorPublico {
    //Inserindo Atributos
    private int matricula;
    private String nome;
    private String orgao;
    private String cargo;
    private String lotacao;
    private String email;
    private double salario;

    //Reuso - Associação
    private List<Curso> cursos = new LinkedList<>();
    //Reusoo - Agregação
    private List<Dependente> dependentes = new LinkedList<>();
    //Reuso - Composição
    private List<Telefone> telefones = new LinkedList<>();
    //Construtor padrão
    public ServidorPublico() {

    }

    public void getCursos() {
        for (Curso c : cursos) {
            System.out.println(c);
        }
    }

    public void setCursos(Curso cursos) {
        this.cursos.add(cursos) ;
    }

    public void getDependentes() {
        for (Dependente d : dependentes) {
            System.out.println(d);
        }
    }

    public void setDependentes(Dependente dependentes) {
        this.dependentes.add(dependentes);
    }

    public void getTelefones() {
        for (Telefone t : telefones) {
            System.out.println(t);
        }
    }

    public void setTelefones(Telefone telefones) {
        this.telefones.add(telefones);
    }

    public ServidorPublico(int matricula, String nome, String orgao, String cargo, String lotacao, String email, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.orgao = orgao;
        this.cargo = cargo;
        this.lotacao = lotacao;
        this.email = email;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ServidorPublico{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", orgao='" + orgao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", lotacao='" + lotacao + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }
}
