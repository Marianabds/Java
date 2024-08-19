public class Lampada {

    String marca;
    String tipoLuz;
    String cor;
    String tensao;
    int potencia;
    int garantiaMeses;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else{
            System.out.println("Lâmpada está desligada");
        }
    }
}
