package test;

import dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // Exercício 14 - valor total em estoque
        Produto produto = new Produto();
        produto.nome = "Mouse";
        produto.preco = 80.0;
        produto.quantidade = 15;

        System.out.println("Valor total em estoque de " + produto.nome + ": R$ " + produto.calcularValorTotal());
    }
}
