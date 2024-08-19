/*
Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.
*/

import java.util.Scanner;

public class Exer02 {

    public static void main (String[] args){

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }
    }
}
