package lista1;
//5) Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este
//sofreu um desconto de 10%.
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
