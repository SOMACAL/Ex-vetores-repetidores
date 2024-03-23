//Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros
//de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +
//8*9 = 140

import java.util.Scanner;

public class Ex11 {
    public static void executar11() {
        Scanner scanner = new Scanner(System.in);

        // Inicializa os vetores
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        // Pede ao usu�rio para inserir os elementos do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetor1[i] = scanner.nextInt();
        }

        // Pede ao usu�rio para inserir os elementos do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " elemento: ");
            vetor2[i] = scanner.nextInt();
        }

        // Calcula o produto escalar
        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        // Exibe o resultado
        System.out.println("O produto escalar entre os dois vetores : " + produtoEscalar);
    }
}
