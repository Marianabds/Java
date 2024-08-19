package com.mariana.cursojava.aula32;//exemplo de encapsulamento

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.setMarca("Fiat");

        System.out.println(van.getMarca());
    }
}
