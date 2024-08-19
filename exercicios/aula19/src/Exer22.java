/*
 Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.
*/

public class Exer22 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 1);

            if (vetorA[i] == 0){
                qtd0++;
            } else{
                qtd1++;
            }
        }

        //10 -- 100
        //qtd -- x
        //x = (qtd * 100) / 10

        int porcentagem0 = (qtd0 * 100) / vetorA.length;
        int porcentagem1 = 100 - porcentagem0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Porcentagem 0: " + porcentagem0);
        System.out.println("Porcentagem 1: " +porcentagem1);
    }
}
