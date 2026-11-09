package test;

import dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        // Exercício 25 - verificar maioridade
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Lucas";
        pessoa.idade = 21;

        if (pessoa.isMaiorDeIdade(18)) {
            System.out.println(pessoa.nome + " é maior de idade.");
        } else {
            System.out.println(pessoa.nome + " é menor de idade.");
        }
    }
}
