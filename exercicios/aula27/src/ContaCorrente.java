public class ContaCorrente {

    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double limite;

    boolean realizarSaque(double quantiaSaque){

        if (saldo >= quantiaSaque){
            saldo -= quantiaSaque;
            return true;
        } else{
            if (especial) {
                limite = limiteEspecial + saldo;
                if (limite >= quantiaSaque){
                    saldo -= quantiaSaque;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositar(double quantiaDeposito){
        saldo += quantiaDeposito;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }


}
