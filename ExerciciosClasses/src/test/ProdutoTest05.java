package test;

import dominio.Produto;

public class ProdutoTest05 {
    public static void main(String[] args) {
        // Exercício 22 - aumentar preço
        Produto produto = new Produto();
        produto.nome = "Tênis";
        produto.preco = 200.0;

        double novoPreco = produto.aumentarPreco(20);
        System.out.println("Preço original: R$ " + produto.preco);
        System.out.println("Preço com aumento de 20%: R$ " + novoPreco);
    }
}
