/*
 Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.
*/

import java.util.Scanner;

public class Exer13 {

    public static void main (String[] args){

        int[] vetorA = new int[10];
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Quantidade de pares: " + soma);
    }
}
