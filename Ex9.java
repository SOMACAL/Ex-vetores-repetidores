//Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
//de acordo com as seguintes regras:
//a. Os elementos das posicoes pares de C sao os elementos das posicoes pares de A;
//b. Os elementos das posicoes impares de C sao os elementos das posicoes impares de B;

import java.util.Scanner;

public class Ex9 {
    public static void executar9() {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                vetorC[i] = vetorA[i];
            } else { 
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("Vetor C :");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
