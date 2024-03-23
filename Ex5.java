
//Elabore um programa que leia 5 numeros do teclado e os armazene em um vetor.
//Em seguida, leia um numero n qualquer e apresente na tela a quantidade de vezes
//que o numero n aparece no vetor.
import java.util.Scanner;

public class Ex5 {
    public static void executar5() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um numero n: ");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                count++;
            }
        }

        System.out.println("O numero " + n + " aparece " + count + " vezes no vetor.");
    }
}
