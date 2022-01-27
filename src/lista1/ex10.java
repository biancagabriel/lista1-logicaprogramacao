package lista1;
/*10) Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que: A = lado * lado. */

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double area, lado;

        System.out.println("digite o valor do lado:");
        lado = entrada.nextDouble();

        area = Math.pow(lado,lado);

        System.out.println("a area do quadrado é:" + area);
    }
}
