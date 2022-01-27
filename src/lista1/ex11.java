package lista1;
/*11) Faça um programa que calcule e mostre a área de um losango. Sabe-se que: A = (diagonal maior *
diagonal menor)/2. */

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, diagonalMaior, diagonalMenor;

        System.out.println("digite o valor da diagonal maior: ");
        diagonalMaior = entrada.nextDouble();
        System.out.println("digite o valor da diagonal menor:");
        diagonalMenor = entrada.nextDouble();

        area=(diagonalMaior * diagonalMenor)/2;

        System.out.println("a area é:" +area);
    }
}
