package org.lista1;

import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();


        vetor[0] = valorInicial;


        for (int i = 1; i < 10; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }


        System.out.println("Vetor resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}
