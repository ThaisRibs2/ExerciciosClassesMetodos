package test;

import dominio.CadastroProduto;
import dominio.ImpressoraProduto;
import dominio.Produto;

public class CadastroProdutoTest01 {
    public static void main(String[] args) {
        // Exercício 43 - cadastrar produto
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(produto1, "Teclado", 150.0, 10);
        cadastro.cadastrar(produto2, "Mouse", 80.0, 25);

        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto1);
        System.out.println("-----");
        impressora.imprime(produto2);
    }
}
