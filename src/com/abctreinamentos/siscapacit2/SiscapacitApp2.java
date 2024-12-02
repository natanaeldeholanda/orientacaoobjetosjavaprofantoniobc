package com.abctreinamentos.siscapacit2;

import com.abctreinamentos.siscapacit.ServidorPublico;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
/*
 * Autor: Natanael de Holanda
 * Versão: 1.0
 * Descrição: Classe que representa o Servidor Público
 */

// Atributos
public class SiscapacitApp2 implements APIServidorPublico, APICurso {
    List<com.abctreinamentos.siscapacit.ServidorPublico> servidores = new LinkedList<>();
    List<com.abctreinamentos.siscapacit.Curso> cursos = new LinkedList<>();

    //Métodos CRUD - Servidor Público
    public void adicionarServidorPublico() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do servidor"));
        String nomeServidor = JOptionPane.showInputDialog("Digite o nome do servidor");
        String orgao = JOptionPane.showInputDialog("Digite o órgão do servidor");
        String cargo = JOptionPane.showInputDialog("Digite o cargo do servidor");
        String lotacao = JOptionPane.showInputDialog("Digite o lotação do servidor");
        String email = JOptionPane.showInputDialog("Digite o email do servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do servidor"));

        com.abctreinamentos.siscapacit.ServidorPublico servidor = new com.abctreinamentos.siscapacit.ServidorPublico(matricula, nomeServidor, orgao, cargo, lotacao, email, salario);
        servidores.add(servidor);
    }

    @Override
    public void listarServidoresPublicos() {

    }

    public void listaServidoresPublicos() {
        for (com.abctreinamentos.siscapacit.ServidorPublico servidor : servidores) {
            System.out.println(servidor);
        }
    }

    public void listarServidoresPublicos(int matricula) {
        boolean encontrou = false;
        for (com.abctreinamentos.siscapacit.ServidorPublico servidor : servidores) {
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

    @Override
    public void alterarServidorPublico(unidade04.ServidorPublico servidorAlterado) {

    }

    public void excluirServidorPublico(int matricula) {
        boolean encontrou = false;
        for (com.abctreinamentos.siscapacit.ServidorPublico servidor : servidores) {
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

    @Override
    public void calcularFolhaServidoresPublicos() {

    }

    @Override
    public void adicionarCursoServidorPublico(int matricula, int idcurso) {

        boolean encontrou = false;
        for (ServidorPublico servidor : servidores) {
            if (servidor.getMatricula() == matricula) {
                servidores.remove(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("O Servidor Público com a matrícula informada não existe");
            {
                System.out.println("A exclusão do Seridor Público com a matrícula" + matricula);
            }
        }

    }

    @Override
    public void excluirCursoServidorPublico(int matricula, int idcurso) {

    }

    @Override
    public void listarCursoServidorPublico(int matricula) {

    }

    public void alterarServidorPublico(com.abctreinamentos.siscapacit.ServidorPublico servidorAlterado) {
        boolean encontrou = false;
        for (com.abctreinamentos.siscapacit.ServidorPublico servidor : servidores) {
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

    //Metodo CRUD de Adicionar curso
    public void adicionarCurso() {
        int idCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do curso"));
        String nome = JOptionPane.showInputDialog("Digite o nome do curso");
        String formaRealizacao = JOptionPane.showInputDialog("Digite a forma realização");
        String ofertante = JOptionPane.showInputDialog("Digite o ofertante do curso");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso"));
    }

    @Override
    public void listarCurso() {

    }

    @Override
    public void listarCurso(int matricula) {

    }

    @Override
    public void alterarCurso(com.abctreinamentos.siscapacit2.Curso servidorAlterado) {

    }

    //Método de listar cursos
    public void listarCursos() {
        for (com.abctreinamentos.siscapacit.Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public void listarCursos(int idcurso) {
        boolean encontrou = false;
        for (com.abctreinamentos.siscapacit.Curso curso : cursos) {
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

    public void alterarCurso(com.abctreinamentos.siscapacit.Curso cursoAlterado) {
        boolean encontrou = false;
        for (com.abctreinamentos.siscapacit.Curso curso : cursos) {
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
        for (com.abctreinamentos.siscapacit.Curso curso : cursos) {
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

    @Override
    public void adicionarServidorCurso(int idcurso, int matricula) {

    }

    @Override
    public void excluirServidorCurso(int matricula, int idcurso) {

    }

    @Override
    public void listarServidorCurso(int idcurso) {

    }

    @Override
    public void excluirServidor(int idcurso, int matricula) {

    }

//    @Override
//    public void listarServidorCurso(int matricula) {
//       for(ServidorPublico servidor : servidores){
//           if(servidor.getMatricula() == matricula){
//
//           }
//           for(Curso curso : cursos){
//               if (curso.getIdcurso() == idcurso){
//                   servidor.se
//               }
//           }
//       }
//
//    }

    public static void main(String[] args) {
        //PARTE ONDE CRIA, LISTA, ALTERA E EXCLUI OS SERVIDORES PÚBLICOS;
        SiscapacitApp2 sistema = new SiscapacitApp2();
        System.out.println("********** 02 Servidores **********");
        sistema.adicionarServidorPublico();
        sistema.adicionarServidorPublico();
        sistema.listaServidoresPublicos();

        System.out.println("********** 02 Cursos **********");
        sistema.adicionarCurso();
        sistema.adicionarCurso();
        sistema.listarCursos();

        sistema.adicionarCursoServidorPublico(1, 10);
        sistema.adicionarCursoServidorPublico(2, 10);

        sistema.adicionarCursoServidorPublico(1, 20);
        sistema.adicionarCursoServidorPublico(2, 20);

    }
}
