//Faca um programa que leia dois vetores de 5 elementos cada e verifique se eles
//sao iguais ou nao. Para serem iguais, todos os elementos dos dois vetores devem
//coincidir

import java.util.Scanner;

public class Ex7 {
    public static void executar7() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetor2[i] = scanner.nextInt();
        }

        boolean saoIguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            System.out.println("Os vetores sao iguais.");
        } else {
            System.out.println("Os vetores nao sao iguais.");
        }
    }
}
