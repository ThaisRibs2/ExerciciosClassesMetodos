package test;

import dominio.CadastroEstudante;
import dominio.Estudante;
import dominio.ImpressoraEstudante;

public class CadastroEstudanteTest01 {
    public static void main(String[] args) {
        // Exercício 41 - cadastrar estudante
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(estudante1, "Maria Silva", 20, 'F');
        cadastro.cadastrar(estudante2, "Pedro Lima", 22, 'M');

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        System.out.println("-----");
        impressora.imprime(estudante2);
    }
}
