package lista1;
/*15) Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa*/

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double hipotenusa=0, cateto1, cateto2;

        System.out.println("digite o valor do cateto 1:");
        cateto1 = entrada.nextDouble();
        System.out.println("digite o valor do cateto 2:");
        cateto2 = entrada.nextDouble();

        System.out.println("A Hipotenusa é"+(sqrt(cateto1*cateto1)+(cateto2*cateto2)));

    }
}
