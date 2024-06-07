package com.abctreinamentos.siscapacit2;

import unidade04.ServidorPublico;

public class Temporario extends ServidorPublico {
    private String contrato;
    private double salario;

    public Temporario(String contrato, double salario, int matricula, String nome) {
        super(matricula, nome);
        this.contrato = contrato;
        this.salario = salario;
    }

    public String getContrato() {
        return contrato;
    }
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Temporario{" +
                "contrato='" + contrato + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                "} ";
    }
}
