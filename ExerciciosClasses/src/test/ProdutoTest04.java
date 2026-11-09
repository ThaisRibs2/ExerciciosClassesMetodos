package test;

import dominio.Produto;

public class ProdutoTest04 {
    public static void main(String[] args) {
        // Exercício 21 - aplicar desconto
        Produto produto = new Produto();
        produto.nome = "Camiseta";
        produto.preco = 100.0;

        double precoComDesconto = produto.aplicarDesconto(10);
        System.out.println("Preço original: R$ " + produto.preco);
        System.out.println("Preço com 10% de desconto: R$ " + precoComDesconto);
    }
}
