package lista1;

/*12) Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e
mostre a quantidade de salários mínimos que esse funcionário ganha.*/

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioMinimo, salarioFuncionario, qtdSalarioMinimo;

        System.out.println("digite o valor do salario minimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("digite o valor do salario atual:");
        salarioFuncionario = entrada.nextDouble();

        qtdSalarioMinimo = salarioFuncionario/salarioMinimo;

        System.out.println("a quantidade de salarios minimos é: R$"+qtdSalarioMinimo);
    }
}
