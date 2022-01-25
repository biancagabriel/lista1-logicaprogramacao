package lista1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorInicial, valorFinal;

        System.out.println("digite o valor inicial do produto:");
        valorInicial = entrada.nextDouble();

        valorFinal = valorInicial - 0.10;

        System.out.println("o valor final é: R$"+valorFinal);
    }
}
