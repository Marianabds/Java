/*
 Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.
*/

import java.util.Scanner;

public class Exer10 {

    public static void main (String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor A: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

    }
}
