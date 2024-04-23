package org.lista1;

import java.util.Scanner;
public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int N;
        do {
            System.out.print("Digite um número inteiro (2 <= N <= 5): ");
            N = scanner.nextInt();
        } while (N < 2 || N > 5);


        int[][] matriz = new int[N][N];


        int valor = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }


        int[][] quadradoMatriz = calcularQuadradoMatriz(matriz, N);


        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("Quadrado da matriz:");
        imprimirMatriz(quadradoMatriz);

        scanner.close();
    }


    public static int[][] calcularQuadradoMatriz(int[][] matriz, int N) {
        int[][] quadradoMatriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    quadradoMatriz[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        return quadradoMatriz;
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
