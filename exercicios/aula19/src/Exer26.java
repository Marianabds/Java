/*
 Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando Ai for menor que Bi.
*/

import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i = 0; i < (vetorA.length); i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor do vetor B: ");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else{
                vetorC[i] = -1;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < (vetorA.length); i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < (vetorB.length); i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor C: ");
        for (int i = 0; i < (vetorC.length); i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
