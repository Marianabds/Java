/*
Cria uma classe conta corrente que possui um
número, um saldo, um status que informa se ela é especial ou não, um
limite. Desenvolva métodos para realizar saque (verificando se o cliente
pode realizar saques), despositar dinheiro, consultar saldo e verificar se o
cliente está usando cheque especial ou não. Desenvolva um programa
para testar essa classe.
*/

public class Exer02 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numero = "12345";
        conta.agencia = "123";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = 0;

        conta.consultarSaldo();

        boolean saqueEfetuado = conta.realizarSaque(25);

        if (saqueEfetuado) {
            System.out.println("Saque efetado.");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

        conta.depositar(0);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }
    }
}
