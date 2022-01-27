package lista1;
/*8) Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas.*/

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, pesoEmGramas;

        System.out.println("digite seu peso:");
        peso = entrada.nextDouble();

        pesoEmGramas = peso*1000;

        System.out.println("o peso em gramas é: " +pesoEmGramas);
    }
}
