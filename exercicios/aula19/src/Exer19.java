/*
 Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.
*/

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] resultado = new double[5];

        for(int i = 0; i < nota1.length; i++){
            System.out.println("Digite a nota 1 do aluno " + (i+1) + ": ");
            nota1[i] = scan.nextDouble();

            System.out.println("Digite a nota 2 do aluno " + (i+1) + ": ");
            nota2[i] = scan.nextDouble();

            resultado[i] = (nota1[i] + nota2[i]) / 2;
        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Media do aluno " + (i+1) + " : ");
            if (resultado[i] >= 70){
                System.out.println(resultado[i] + " - Aprovado.");
            } else {
                System.out.println(resultado[i] + " - Reprovado.");
            }
        }

    }
}
