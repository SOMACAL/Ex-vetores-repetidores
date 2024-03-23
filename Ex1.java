//Construa um programa que leia em um vetor uma sequencia de 5 numeros digitados
//pelo usuurio, calcule a media e apresente na tela quais valores sao menores,
 //iguais ou superiores e media.

 import java.util.Scanner;

 public class Ex1 {
 
     public static void executar() {
 
        Scanner leitor = new Scanner(System.in);

        double[] vetor = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            vetor[i] = leitor.nextDouble();
        }

        double soma = 0;
        for (double num : vetor) {
            soma += num;
        }
        double media = soma / vetor.length;

        double[] menores = new double[5];
        double[] iguais = new double[5];
        double[] superiores = new double[5];

        int menorIndex = 0, igualIndex = 0, superiorIndex = 0;
        for (double num : vetor) {
            if (num < media) {
                menores[menorIndex++] = num;
            } else if (num == media) {
                iguais[igualIndex++] = num;
            } else {
                superiores[superiorIndex++] = num;
            }
        }

        System.out.println("\nMedia: " + media);
        System.out.print("Valores menores que a media: ");
        for (int i = 0; i < menorIndex; i++) {
            System.out.print(menores[i] + " ");
        }
        System.out.println();
        System.out.print("Valores iguais a media: ");
        for (int i = 0; i < igualIndex; i++) {
            System.out.print(iguais[i] + " ");
        }
        System.out.println();
        System.out.print("Valores superiores a media: ");
        for (int i = 0; i < superiorIndex; i++) {
            System.out.print(superiores[i] + " ");
        }
    }
}
