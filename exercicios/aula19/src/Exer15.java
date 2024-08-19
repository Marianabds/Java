/*
Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
*/

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

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

        int qtdImpar = vetorA.length - qtdPares;
        double porcentagemPares = (qtdPares * 100) / vetorA.length;
        double porcentagemImpares = 100 - porcentagemPares;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Porcentagem Pares: " + porcentagemPares);
        System.out.println("Porcentagem Impares: " +porcentagemImpares);
    }
}
