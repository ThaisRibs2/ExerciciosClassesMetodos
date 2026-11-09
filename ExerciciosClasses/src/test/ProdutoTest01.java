package test;

import dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        // Exercício 4
        Produto produto = new Produto();
        produto.nome = "Teclado";
        produto.preco = 150.0;
        produto.quantidade = 10;

        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
    }
}
