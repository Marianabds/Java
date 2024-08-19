/*
 Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.
*/

import java.util.Scanner;

public class Exer12 {

    public static void main (String[] args){

        int[] vetorA = new int[10];
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            soma += vetorA[i];
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("Soma: " + soma);
    }
}

