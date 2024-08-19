/*
Escreva uma class para representar um Aluno. Adicione atributos
relacionados às caracteristicas de um Aluno, como nome, matricula, curso
que está matriculado, nome de 3 disciplinas que está cursando e as notas
dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do
aluno ao usuário e ao final informa o nome das disciplinas, mostra as
notas e mostra se o aluno foi aprovado ou não.
*/

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Informe o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Informe a matrícula: ");
        aluno.matricula = scan.next();

        for (int i = 0; i < aluno.nomesDisciplinas.length; i++){
            System.out.println("Informe o nome da " + (i+1) + "° disciplina: ");
            aluno.nomesDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + aluno.nomesDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Informe a " + (j+1) + "° nota: ");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInformacoes();

        for (int i = 0; i < aluno.nomesDisciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " + aluno.nomesDisciplinas[i] + " - Aprovado");
            } else {
                System.out.println("Disciplina: " + aluno.nomesDisciplinas[i] + " - Reprovado");
            }
        }
    }
}
