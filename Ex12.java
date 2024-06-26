//Elabore um programa que leia um vetor de 12 elementos apresente na tela o
//produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -
//6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

import java.util.Scanner;

public class Ex12 {
    public static void executar12() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetor[i] = scanner.nextInt();
        }

        int produtoParesPositivos = 1;

        for (int i = 0; i < 12; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] > 0) {
                produtoParesPositivos *= vetor[i];
            }
        }

        System.out.println("O produto dos elementos pares positivos : " + produtoParesPositivos);
    }
}
