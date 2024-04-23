package org.lista1;

import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        int determinante = calcularDeterminante(matriz);


        System.out.println("O determinante da matriz é: " + determinante);

        scanner.close();
    }


    public static int calcularDeterminante(int[][] matriz) {
        int determinante = 0;

        determinante += (matriz[0][0] * matriz[1][1] * matriz[2][2]);
        determinante += (matriz[0][1] * matriz[1][2] * matriz[2][0]);
        determinante += (matriz[0][2] * matriz[1][0] * matriz[2][1]);
        determinante -= (matriz[0][2] * matriz[1][1] * matriz[2][0]);
        determinante -= (matriz[0][1] * matriz[1][0] * matriz[2][2]);
        determinante -= (matriz[0][0] * matriz[1][2] * matriz[2][1]);


        return determinante;
    }

}
