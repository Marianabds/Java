/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] / float(B[i]).
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

    public static void main (String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A: ");
            vetorA[i] = scan.nextInt();
        }

        for (int j = 0; j < vetorB.length; j++){
            System.out.println("Digite o " + (j + 1) + "° valor do vetor B: ");
            vetorB[j] = scan.nextInt();

            vetorC[j] = vetorA[j] / vetorB[j];
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i] + " ");
        }
    }
}
