package com.abctreinamentos.siscapacit;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
/*
 * Autor: Natanael de Holanda
 * Versão: 1.0
 * Descrição: Classe que representa o Servidor Público
 */

// Atributos
public class SiscapacitApp {
    List<ServidorPublico> servidores = new LinkedList<>();
    List<Curso> cursos = new LinkedList<>();

    //Métodos CRUD - Servidor Público
    public void adicionarServidorPublico() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do servidor"));
        String nomeServidor = JOptionPane.showInputDialog("Digite o nome do servidor");
        String orgao = JOptionPane.showInputDialog("Digite o órgão do servidor");
        String cargo = JOptionPane.showInputDialog("Digite o cargo do servidor");
        String lotacao = JOptionPane.showInputDialog("Digite o lotação do servidor");
        String email = JOptionPane.showInputDialog("Digite o email do servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do servidor"));

        ServidorPublico servidor = new ServidorPublico(matricula, nomeServidor, orgao, cargo, lotacao, email, salario);
        servidores.add(servidor);
    }

    public void listaServidoresPublicos() {
        for (ServidorPublico servidor : servidores) {
            System.out.println(servidor);
        }
    }

    public void listarServidoresPublicos(int matricula) {
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores) {
            if (servidor.getMatricula() == matricula) {
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O Servidor Público com a matrícula informada, não existe");
        }
    }

    public void excluirServidorPublico(int matricula) {
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores) {
            if (servidor.getMatricula() == matricula) {
                servidores.remove(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O Servidor Público com a matrícula informada, não existe");
        } else {
            System.out.println("Exclusão do Servidor Público com a matrícula" + matricula + " foi realizada com sucesso.");
        }
    }

    public void alterarServidorPublico(ServidorPublico servidorAlterado) {
        boolean encontrou = false;
        for (ServidorPublico servidor : servidores) {
            if (servidor.getMatricula() == servidorAlterado.getMatricula()) {
                servidores.remove(servidor);
                servidores.add(servidorAlterado);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O Servidor Público com a matrícula informada, não existe");
        } else {
            System.out.println("Alteração do Servidor Público com a matrícula" + servidorAlterado.getMatricula() + " foi realizada com sucesso.");
        }
    }

    public void calcularFolhaServidorPublico() {
        double folhaSalarial = 0;
        for (ServidorPublico servidor : servidores) {
            folhaSalarial = folhaSalarial + servidor.getSalario();
            System.out.println("A folha salarial é: " + folhaSalarial);
        }
    }

    //Método de Adicionar curso
    public void adicionarCurso() {
        int idCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do curso"));
        String nome = JOptionPane.showInputDialog("Digite o nome do curso");
        String formaRealizacao = JOptionPane.showInputDialog("Digite a forma realização");
        String ofertante = JOptionPane.showInputDialog("Digite o ofertante do curso");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso"));
    }

    //Método de listar cursos
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public void listarCursos(int idcurso) {
        boolean encontrou = false;
        for (Curso curso : cursos) {
            if (curso.getIdcurso() == idcurso) {
                System.out.println(curso);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O Curso com o ID informado não foi encontrado.");
        }
    }

    public void alterarCurso(Curso cursoAlterado) {
        boolean encontrou = false;
        for (Curso curso : cursos) {
            if (curso.getIdcurso() == cursoAlterado.getIdcurso()) {
                cursos.remove(curso);
                cursos.add(cursoAlterado);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O curso com o ID informado não foi encontrado.");
        } else {
            System.out.println("A Alteração do curso com o ID" + cursoAlterado.getIdcurso() + " foi realizada com sucesso.");
        }
    }

    public void excluirCurso(int idcurso) {
        boolean encontrou = false;
        for (Curso curso : cursos) {
            if (curso.getIdcurso() == idcurso) {
                cursos.remove(curso);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O curso com o ID informado não foi encontrado.");
        } else {
            System.out.println("A exclusão do curso com o ID" + idcurso + " foi realizada com sucesso.");
        }
    }

    public static void main(String[] args) {
        //PARTE ONDE CRIA, LISTA, ALTERA E EXCLUI OS SERVIDORES PÚBLICOS;
        SiscapacitApp sistema = new SiscapacitApp();
        /*sistema.adicionarServidorPublico();
        sistema.adicionarServidorPublico();
        System.out.println("********** 02 servidores **********");
        sistema.listaServidoresPublicos();
        //sistema.listarServidoresPublicos(1);
        //sistema.listarServidoresPublicos(4);
        //sistema.excluirServidorPublico(4);
        ServidorPublico servidorAlterado = new ServidorPublico(4, "Paulo F. Sampaio", "SPS", "Analista 4", "COTIC", "paulo.sps.ce.gov.br", 45000);
        sistema.alterarServidorPublico(servidorAlterado);
        System.out.println("********** 01 servidor **********");
        sistema.listaServidoresPublicos();
        sistema.calcularFolhaServidorPublico(); */

        sistema.adicionarCurso();
        sistema.adicionarCurso();
        System.out.println("********** 02 Cursos **********");
        sistema.listarCursos();
        sistema.listarCursos(1);
        sistema.listarCursos(2);
        Curso cursoAlterado = new Curso(2, "Curso alterado", "Presencial", "Instituição X", 250.00);
        sistema.alterarCurso(cursoAlterado);
        System.out.println("********** 01 Curso **********");
        sistema.listarCursos();
    }
}
