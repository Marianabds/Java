/*
 Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A são pares. Se pelo
menos um elemento do vetor não for par o processo de repetição para
percorrer os elementos do vetor deve ser encerrado, como sugestão:
utilize uma variável do tipo flag para atingir este propósito.
*/

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0){
                break;
            }
        }

    }
}
