package test;

import dominio.ComparadorProduto;
import dominio.Produto;

public class ComparadorProdutoTest01 {
    public static void main(String[] args) {
        // Exercício 45 - comparar dois produtos
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.0;

        Produto produto2 = new Produto();
        produto2.nome = "Tablet";
        produto2.preco = 1800.0;

        ComparadorProduto comparador = new ComparadorProduto();
        Produto maisCaro = comparador.retornarProdutoMaisCaro(produto1, produto2);

        System.out.println("Produto mais caro: " + maisCaro.nome);
    }
}
