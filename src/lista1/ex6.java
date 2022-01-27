package lista1;
/*6) Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que
receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu salário
final.*/

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioInicial, vendas, comissao, salarioFinal;

        System.out.println("digite o valor do salario:");
        salarioInicial = entrada.nextDouble();
        System.out.println("digite o valor das vendas:");
        vendas = entrada.nextDouble();

        comissao = vendas * 0.04;
        salarioFinal = salarioInicial + comissao;

        System.out.println("o salario final é: R$"+salarioFinal);
    }
}
