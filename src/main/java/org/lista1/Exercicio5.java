package org.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor para encontrar o número de Fibonacci correspondente: ");
        long valor = scanner.nextLong();


        long fibPrevPrev = 0;
        long fibPrev = 1;
        long fibAtual = 0;

        if (valor == 0) {
            fibAtual = 0;
        } else if (valor == 1) {
            fibAtual = 1;
        } else {
            for (long i = 2; i <= valor; i++) {
                fibAtual = fibPrevPrev + fibPrev;
                fibPrevPrev = fibPrev;
                fibPrev = fibAtual;
            }
        }


        System.out.println("O número de Fibonacci correspondente é: " + fibAtual);

        scanner.close();
    }
}
