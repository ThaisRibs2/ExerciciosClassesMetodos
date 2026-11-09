package dominio;

public class Pessoa {
    public String nome;
    public int idade;

    // Exercício 25
    public boolean isMaiorDeIdade(int idadeMinima) {
        return idade >= idadeMinima;
    }
}
