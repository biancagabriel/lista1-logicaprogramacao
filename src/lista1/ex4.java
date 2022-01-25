package lista1;

//4) Faça um programa que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando
//peso 2 para a primeira e peso 3 para a segunda.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1,nota2;
        double media;

        System.out.println("digite a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("digite a segunda nota:");
        nota2 = entrada.nextDouble();

        media = (nota1 *3) + (nota2 *3)/2;

        System.out.println("a média é:" +media);
    }
}
