//Escreva um algoritmo que leia em um vetor uma sequencia finita de numeros
//digitados pelo usuurio e, logo apos, mostre o numero de cada posicao do vetor e se
//ele ou positivo, negativo ou zero.
import java.util.Scanner;

public class Ex2 {
    public static void executar2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o numero para a posicao " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O numero " + vetor[i] + " na posicao " + i + " e positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O numero " + vetor[i] + " na posicao " + i + " e negativo.");
            } else {
                System.out.println("O n�mero " + vetor[i] + " na posicao " + i + " e zero.");
            }
        }
    }
}
