package lista1;

import java.util.Scanner;

//2) Faça um programa que receba três números, calcule e mostre a multiplicação desses números.

public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c,multi;

        System.out.println("digite o primeiro número:");
        a = entrada.nextInt();
        System.out.println("digite o segundo numero:");
        b = entrada.nextInt();
        System.out.println("digite o terceiro numero:");
        c = entrada.nextInt();

        multi = a*b*c;

        System.out.println("o resultado é: " +multi);
    }
}
