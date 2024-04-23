package org.lista1;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[100];

        System.out.print("Digite o valor inicial (X): ");
        double valorInicial = scanner.nextDouble();


        vetor[0] = valorInicial;


        for (int i = 1; i < 100; i++) {
            vetor[i] = vetor[i - 1] / 2;
        }


        System.out.println("Vetor resultante:");
        for (int i = 0; i < 100; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}
