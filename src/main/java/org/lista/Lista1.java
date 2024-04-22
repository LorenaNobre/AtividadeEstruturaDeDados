package org.lista;

import java.util.Scanner;

public class Lista1{
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        int [] vetor = new int [10];

        System.out.println("Digite 10 números inteiros: ");
        int i;
        for ( i = 0; i < 10; i ++ ) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Valores Pares: ");
        for (int num : vetor){
            if(num % 2 == 0){
                System.out.println(num);
            }

        }

        System.out.println("Valores Impares: ");
        for (int num : vetor){
            if (num % 2 != 0){
                System.out.println(num);
            }
        }


    }

}
