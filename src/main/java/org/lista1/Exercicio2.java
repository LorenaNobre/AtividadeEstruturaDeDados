package org.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        double soma = 0;
        double somaPesos = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            soma += vetor[i] * i;
            somaPesos += i;
        }

        double mediaPonderada = soma / somaPesos;

        System.out.println("A média ponderada dos valores é: " + mediaPonderada);

        scanner.close();

    }
}
