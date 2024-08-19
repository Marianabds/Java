/*
Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.
*/

import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMenor15 = 0, igual15 = 0, somaMaior15 = 0, maior15 = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] == 15){
                igual15++;
            } else if (vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            } else {
                somaMaior15 += vetorA[i];
                maior15++;
            }
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Soma dos inferiores a 15: " + somaMenor15);
        System.out.println("Elementos iguais a 15: " + igual15);
        System.out.println("Media dos superiores a 15: " + (somaMaior15 / maior15));
    }
}
