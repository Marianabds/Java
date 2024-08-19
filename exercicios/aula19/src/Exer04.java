/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).
*/

import java.util.Scanner;

public class Exer04 {

    public static void main (String[] args) {

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }
    }
}
