package test;

import dominio.Aluno;
import dominio.ComparadorAluno;

public class ComparadorAlunoTest01 {
    public static void main(String[] args) {
        // Exercício 44 - comparar dois alunos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 7.0;
        aluno1.nota2 = 8.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.nota1 = 9.0;
        aluno2.nota2 = 9.5;

        ComparadorAluno comparador = new ComparadorAluno();
        Aluno melhorAluno = comparador.retornarAlunoComMaiorMedia(aluno1, aluno2);

        System.out.println("Aluno com maior média: " + melhorAluno.nome);
    }
}
