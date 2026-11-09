package test;

import dominio.Produto;

public class ProdutoTest07 {
    public static void main(String[] args) {
        // Exercício 30 - estoque mínimo
        Produto produto = new Produto();
        produto.nome = "Pen drive";
        produto.quantidade = 3;

        int quantidadeMinima = 5;
        System.out.println("Quantidade em estoque: " + produto.quantidade);
        System.out.println("Estoque baixo? " + produto.estoqueBaixo(quantidadeMinima));
    }
}
