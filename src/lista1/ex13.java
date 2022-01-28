package lista1;
/*13) Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
a) a idade dessa pessoa em anos;
b) a idade dessa pessoa em meses;
c) a idade dessa pessoa em dias;
d) a idade dessa pessoa em semanas.*/

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int anoNasc, anoAtual, idadeAnos, idadeMeses, idadeDias, idadeSemanas;

        System.out.println("digite o ano atual:");
        anoAtual = entrada.nextInt();
        System.out.println("digite o ano de nascimento:");
        anoNasc = entrada.nextInt();

        idadeAnos = anoAtual - anoNasc;
        idadeMeses = anoNasc*12;
        idadeDias = anoNasc * 365;
        idadeSemanas = anoNasc*52;

        System.out.println("idade em anos:" +idadeAnos);
        System.out.println("idade em meses:" +idadeMeses);
        System.out.println("idade em dias:" +idadeDias);
        System.out.println("idade em semanas:" +idadeSemanas);
    }
}
