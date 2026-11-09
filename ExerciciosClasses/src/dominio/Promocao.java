package dominio;

public class Promocao {

    // Exercício 48
    public void aplicarDesconto(Produto produto, double porcentagem) {
        produto.preco = produto.preco - (produto.preco * porcentagem / 100);
    }
}
