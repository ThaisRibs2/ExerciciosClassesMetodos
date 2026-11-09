package test;

import dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        // Exercício 5
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;
        livro1.preco = 39.9;

        Livro livro2 = new Livro();
        livro2.titulo = "Clean Code";
        livro2.autor = "Robert C. Martin";
        livro2.numeroPaginas = 464;
        livro2.preco = 120.0;

        System.out.println("Livro 1: " + livro1.titulo + " | " + livro1.autor + " | "
                + livro1.numeroPaginas + " páginas | R$ " + livro1.preco);
        System.out.println("Livro 2: " + livro2.titulo + " | " + livro2.autor + " | "
                + livro2.numeroPaginas + " páginas | R$ " + livro2.preco);
    }
}
