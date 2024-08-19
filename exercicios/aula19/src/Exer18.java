/*
 Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.
*/

import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite a idade " + i +": ");
            vetorA[i] = scan.nextInt();
        }

        int menor = vetorA[0];
        int indexMenor = 0;
        int maior = vetorA[0];
        int indexMaior = 0;

        for(int i = 1; i < vetorA.length; i++){
            if (vetorA[i] < menor){
                menor = vetorA[i];
                indexMenor = i;
            } else if (vetorA[i] > maior) {
                maior = vetorA[i];
                indexMaior = i;
            }
        }

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Menor idade: " + menor + " Indice: " + indexMenor);
        System.out.println("Maior idade: " + maior + " Indice: " + indexMaior);
    }
}
