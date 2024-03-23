//Fa�a um programa que leia um vetor de 5 elementos e, ap�s a leitura, posicione
//o maior elemento na �ltima posi��o do vetor. Nenhum n�mero do vetor pode ser
//apagado ou duplicado. Apresente o vetor atualizado na tela

import java.util.Scanner;

public class Ex14 {
    public static void executar14() {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o vetor com 5 elementos
        int[] vetor = new int[5];

        // Pede ao usu�rio para inserir os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetor[i] = scanner.nextInt();
        }

        // Encontra o �ndice do maior elemento do vetor
        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        // Move o maior elemento para a ultima posicao do vetor
        int temp = vetor[4];
        vetor[4] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        // Exibe o vetor atualizado
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
