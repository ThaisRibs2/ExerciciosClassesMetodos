package test;

import dominio.Filme;

public class FilmeTest02 {
    public static void main(String[] args) {
        // Exercício 19 - filme longo ou curto
        Filme filme = new Filme();
        filme.titulo = "O Senhor dos Anéis: O Retorno do Rei";
        filme.duracaoMinutos = 201;

        if (filme.isFilmeLongo()) {
            System.out.println(filme.titulo + " é um filme longo.");
        } else {
            System.out.println(filme.titulo + " não é um filme longo.");
        }
    }
}
