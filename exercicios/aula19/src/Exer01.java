/*
Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].
*/

import java.util.Scanner;

public class Exer01 {

    public static void main (String[] args){

        int[] vetorA = new int [5];
        int[] vetorB = new int [5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }
    }
}
