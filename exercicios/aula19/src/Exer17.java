/*
 Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.
*/

import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int maior35 = 0;

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite a " + (i + 1) + "° idade: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] > 35){
                maior35++;
            }
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Idades maiores que 35: " + maior35);
    }
}
