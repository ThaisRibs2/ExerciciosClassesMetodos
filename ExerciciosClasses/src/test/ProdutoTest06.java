package test;

import dominio.Produto;

public class ProdutoTest06 {
    public static void main(String[] args) {
        // Exercício 27 - calcular frete
        Produto produto = new Produto();
        produto.nome = "Monitor";
        produto.preco = 900.0;

        double valorFinal = produto.calcularFrete(45.0);
        System.out.println("Preço do produto: R$ " + produto.preco);
        System.out.println("Valor final com frete: R$ " + valorFinal);
    }
}
