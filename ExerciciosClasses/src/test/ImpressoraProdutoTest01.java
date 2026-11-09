package test;

import dominio.ImpressoraProduto;
import dominio.Produto;

public class ImpressoraProdutoTest01 {
    public static void main(String[] args) {
        // Exercício 33 - imprimir dados do produto
        Produto produto1 = new Produto();
        produto1.nome = "Teclado";
        produto1.preco = 150.0;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Mouse";
        produto2.preco = 80.0;
        produto2.quantidade = 25;

        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto1);
        System.out.println("-----");
        impressora.imprime(produto2);
    }
}
