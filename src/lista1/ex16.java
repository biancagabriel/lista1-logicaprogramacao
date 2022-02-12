package lista1;
/*16) Faça um programa que receba o raio, calcule e mostre:
a) o comprimento de uma esfera; sabe-se que C = 2 * π R;
b) a área de uma esfera; sabe-se que A = π R 2 ;
c) o volume de uma esfera; sabe-se que V = 3⁄4 * π R 3 .*/

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double comprimento, raio, area,volume;
        double pi=3.14;

        System.out.println("digite o valor do raio:");
        raio = entrada.nextDouble();

        comprimento = 2*pi*raio;
        area = pi*Math.pow(raio,2);
        volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( raio, 3 );

        System.out.println("o comprimento é: " +comprimento);
        System.out.println("a area é: "+area);
        System.out.println("o volume é: " +volume);
    }
}
