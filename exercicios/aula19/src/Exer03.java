/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].
*/

import java.util.Scanner;

public class Exer03 {

    public static void main (String[] args){

        int[] vetorA = new int [15];
        int[] vetorB = new int [15];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }
    }
}
