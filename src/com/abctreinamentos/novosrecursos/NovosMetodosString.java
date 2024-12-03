package com.abctreinamentos;

public class NovosMetodosString {
    public static void main(String[] args) {
        String texto = "Primeira linha\nSegunda linha\nTerceira linha";
        texto.lines().forEach(System.out::println); 
    }
}
