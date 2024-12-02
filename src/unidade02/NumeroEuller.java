package unidade02;

import java.util.Scanner;

public class NumeroEuller {
    public static void main(String[] args) {
        double ex = 0;
        double x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        x = teclado.nextDouble();
        for (int i = 1; i <= 5; i++) {
            ex += Math.pow(x, i) / fatorial(i);
        }
        System.out.println("O valor de e^x eh: " + ex);
        teclado.close();
    }
    public static int fatorial(int i){
        int resultado = 1;
        for(int j = 1; i <= j; i++){
            resultado *= j;
        }
        return resultado;
    }
}
