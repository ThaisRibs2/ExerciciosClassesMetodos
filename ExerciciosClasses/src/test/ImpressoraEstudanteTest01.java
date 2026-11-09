package test;

import dominio.Estudante;
import dominio.ImpressoraEstudante;

public class ImpressoraEstudanteTest01 {
    public static void main(String[] args) {
        // Exercício 31 - imprimir dados do estudante
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Maria Silva";
        estudante1.idade = 20;
        estudante1.sexo = 'F';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Pedro Lima";
        estudante2.idade = 22;
        estudante2.sexo = 'M';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        System.out.println("-----");
        impressora.imprime(estudante2);
    }
}
