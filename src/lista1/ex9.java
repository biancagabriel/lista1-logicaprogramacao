package lista1;

/*9) Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que: A = ((base maior + base
menor) * altura)/2*/

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area, baseMaior,baseMenor, altura;

        System.out.println("digite o valor da base menor:");
        baseMenor = entrada.nextDouble();
        System.out.println("digite o valor da base maior:");
        baseMaior = entrada.nextDouble();
        System.out.println("digite o valor da altura:");
        altura = entrada.nextDouble();

        area = ((baseMaior+baseMenor) * altura)/2;

        System.out.println("o valor da area é: " +area);
    }
}
