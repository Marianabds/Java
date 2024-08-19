/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou
índice), ou seja:
B[i] = A[i] * i.
*/

import java.util.Scanner;

public class Exer05 {

    public static void main (String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }
    }
}
