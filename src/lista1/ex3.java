package lista1;

//3) Faça um programa que receba dois números, calcule e mostre a divisão do primeiro número pelo
//segundo. Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar com
//validações.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b;
        double divisao =0;

        System.out.println("entre com o primeiro número:");
        a = entrada.nextInt();
        System.out.println("entre com o segundo número?");
        b = entrada.nextInt();

        if(b ==0){
            System.out.println("divisão por 0, não é possível realizar");
        }else {
            divisao = a/b;
        }
        System.out.println("o resultado da divisão é: " + divisao);
    }
}
