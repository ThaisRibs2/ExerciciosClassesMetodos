package test;

import dominio.Livro;

public class LivroTest02 {
    public static void main(String[] args) {
        // Exercício 18 - livro grande ou pequeno
        Livro livro1 = new Livro();
        livro1.titulo = "O Hobbit";
        livro1.numeroPaginas = 336;

        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Príncipe";
        livro2.numeroPaginas = 96;

        System.out.println(livro1.titulo + ": " + livro1.verificarTamanho());
        System.out.println(livro2.titulo + ": " + livro2.verificarTamanho());
    }
}
