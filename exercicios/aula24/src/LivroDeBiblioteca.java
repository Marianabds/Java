/*
Usando o resultado do modelo “Livro” como base, crie uma classe
“LivroDeBiblioteca” que represente os dados básicos de um livro de uma
biblioteca, que pode ser emprestado a leitores.
*/

import java.util.Date;

public class LivroDeBiblioteca {

    String titulo;
    String autor;
    int qtdpaginas;
    String editora;
    String idioma;
    int anoLancamento;
    String isbn;
    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;
}
