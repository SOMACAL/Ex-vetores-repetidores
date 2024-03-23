//Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor
//com 5 pesos e calcule a media ponderada do aluno

import java.util.Scanner;

public class Ex6 {
    public static void executar6() {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double[] pesos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + " nota: ");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o peso para a " + (i + 1) + " nota: ");
            pesos[i] = scanner.nextDouble();
        }

        double soma = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = soma / somaPesos;
        System.out.println("Media ponderada: " + mediaPonderada);
    }
}
