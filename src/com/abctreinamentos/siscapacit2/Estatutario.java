package com.abctreinamentos.siscapacit2;

import unidade04.ServidorPublico;

public class Estatutario extends ServidorPublico {
    private int tempoServico;
    private double salarioBase;

    public Estatutario(int tempoServico, double salarioBase, int matricula, String nome) {
        super(matricula, nome);
        this.tempoServico = tempoServico;
        this.salarioBase = salarioBase;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public String toString() {
        return "Estatutario{" +
                "tempoServico=" + tempoServico +
                ", nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salarioBase='" + salarioBase + '\'' +
                '}';
    }
}
