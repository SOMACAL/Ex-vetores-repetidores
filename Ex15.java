//Elabore um algoritmo que leia 5 numeros do teclado e preencha um vetor de
//acordo com a seguinte regra: com excao do 1 numero, so e permitido armazenar
//um numero se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o proximo
//valor lido so podera ser maior que 5.

import java.util.Scanner;

public class Ex15 {
    public static void executar15() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o 1 numero: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o proximo numero: ");
            int numero = scanner.nextInt();

            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Numero invalido. O proximo numero deve ser maior que o anterior.");
                i--;
            }
        }

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
