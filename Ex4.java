//Elabore um programa que leia um vetor de 5 numeros digitados pelo usuario e uma
//variavel de um numero n qualquer, depois mostre na tela o indice dos elementos que
//sao inferiores a n
import java.util.Scanner;

public class Ex4 {
    public static void executar4() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um numero n: ");
        int n = scanner.nextInt();

        System.out.println("indices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println("indice " + i);
            }
        }
    }
}
