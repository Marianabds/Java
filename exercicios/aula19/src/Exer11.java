/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.
*/

import java.util.Scanner;

public class Exer11 {

    public static void main (String[] args){

        int[] vetorA = new int[10];
        int qtdPares = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0){
                qtdPares++;
            }
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Quantidade de pares: " + qtdPares);
    }
}
