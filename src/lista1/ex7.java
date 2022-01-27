package lista1;
/*7) Faça um programa que receba o peso de uma pessoa, calcule e mostre:
a) o novo peso, se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso, se a pessoa emagrecer 20% sobre o peso digitado.*/


import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double pesoInicial, pesoMais15, pesoMenos20;
        System.out.println("digite seu peso inicial:");
        pesoInicial = entrada.nextDouble();

        pesoMais15 = pesoInicial + 0.15;
        pesoMenos20 = pesoInicial - 0.20;

        System.out.println("peso se engordar: " + pesoMais15 + "kg");
        System.out.println("peso se emagrecer: " + pesoMenos20 + "kg");
    }
}
