package dominio;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    // Exercício 14
    public double calcularValorTotal() {
        return preco * quantidade;
    }

    // Exercício 15
    public String verificarCategoria() {
        if (preco >= 1000) {
            return "Produto caro";
        }
        return "Produto barato";
    }

    // Exercício 21
    public double aplicarDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }

    // Exercício 22
    public double aumentarPreco(double porcentagem) {
        return preco + (preco * porcentagem / 100);
    }

    // Exercício 27
    public double calcularFrete(double taxaFrete) {
        return preco + taxaFrete;
    }

    // Exercício 30
    public boolean estoqueBaixo(int quantidadeMinima) {
        return quantidade < quantidadeMinima;
    }
}
