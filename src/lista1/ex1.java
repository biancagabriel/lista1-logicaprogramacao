package lista1;

//1) Faça um programa que receba dois números, calcule e mostre a subtração do primeiro
//número pelo segundo

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;

        System.out.println("entre com o primeiro número:");
        a = entrada.nextInt();
        System.out.println("entre com o segundo número:");
        b = entrada.nextInt();

        int subtracao = a-b;

        System.out.println("o resultado é: " +subtracao);
    }
}
