package test;

import dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        // Exercício 9
        Filme filme = new Filme();
        filme.titulo = "Interestelar";
        filme.genero = "Ficção científica";
        filme.duracaoMinutos = 169;
        filme.classificacaoIndicativa = 10;

        System.out.println("Título: " + filme.titulo);
        System.out.println("Gênero: " + filme.genero);
        System.out.println("Duração: " + filme.duracaoMinutos + " minutos");
        System.out.println("Classificação indicativa: " + filme.classificacaoIndicativa + " anos");
    }
}
