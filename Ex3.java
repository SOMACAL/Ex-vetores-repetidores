//Faca um programa que leia em um vetor uma sequencia finita de numeros digitados
//pelo usuurio. Crie um segundo vetor que armazene o dobro de cada numero do
//primeiro vetor e depois apresente os valores deste vetor.

import java.util.Scanner;

public class Ex3 {
    public static void executar3() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

      
        int[] vetorOriginal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o numero para a posicao " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }


        int[] vetorDobro = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("\nValores do vetor dobrados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posicao " + i + ": " + vetorDobro[i]);
        }
    }
}
