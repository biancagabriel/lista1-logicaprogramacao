package lista1;
/*17) Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em
Fahrenheit. Sabe-se que F = 180*(C + 32)/100.*/

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("digite a temperatura em celsius:");
        celsius = entrada.nextDouble();

        fahrenheit = 180*(celsius + 32)/100;

        System.out.println("a temperatura em Fahrenheit é: "+fahrenheit);

    }
}
