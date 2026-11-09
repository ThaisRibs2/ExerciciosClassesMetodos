package test;

import dominio.Produto;
import dominio.Promocao;

public class PromocaoTest01 {
    public static void main(String[] args) {
        // Exercício 48 - alterar preço de produto por referência
        Produto produto = new Produto();
        produto.nome = "Camiseta";
        produto.preco = 100.0;

        System.out.println("Preço antes: R$ " + produto.preco);

        Promocao promocao = new Promocao();
        promocao.aplicarDesconto(produto, 25);

        System.out.println("Preço depois: R$ " + produto.preco);
    }
}
