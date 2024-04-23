package org.lista1;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite as dimensões da primeira matriz (linhas e colunas separadas por espaço):");
        int linhasA = scanner.nextInt();
        int colunasA = scanner.nextInt();

        System.out.println("Digite as dimensões da segunda matriz (linhas e colunas separadas por espaço):");
        int linhasB = scanner.nextInt();
        int colunasB = scanner.nextInt();


        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes. O número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz.");
            return;
        }


        int[][] matrizA = lerMatriz(scanner, linhasA, colunasA);
        int[][] matrizB = lerMatriz(scanner, linhasB, colunasB);


        int[][] resultado = multiplicarMatrizes(matrizA, matrizB);


        System.out.println("Resultado da multiplicação das matrizes:");
        imprimirMatriz(resultado);

        scanner.close();
    }


    public static int[][] lerMatriz(Scanner scanner, int linhas, int colunas) {
        System.out.println("Digite os elementos da matriz (linha por linha):");
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }


    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
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
