package lista1;

/*14) João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso, ele deverá pagar
multa de 2% sobre cada conta. Faça um programa que calcule e mostre quanto restará do salário de João.*/

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, conta1, conta2, restoSalario, totalConta;

        System.out.println("digite seu salario:");
        salario = entrada.nextDouble();
        System.out.println("digite o valor da conta 1:");
        conta1 = entrada.nextDouble();
        System.out.println("digite o valor da conta 2:");
        conta2 = entrada.nextDouble();

        totalConta = (conta1 + 0.02) + (conta2 + 0.02);

        restoSalario = salario - totalConta;

        System.out.println(" o valor que restou é: R$"+restoSalario);



    }
}
