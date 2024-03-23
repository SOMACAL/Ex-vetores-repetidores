//Crie um programa que leia um vetor A de 5 posicoes e, ao final da leitura, copie
//os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A e o
//ultimo elemento de B, o segundo elemento de A e o penultimo elemento de B, e assim
//por diante.

import java.util.Scanner;

public class Ex10 {
    public static void executar10() {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        System.out.println("Vetor B (copia invertida de A):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
