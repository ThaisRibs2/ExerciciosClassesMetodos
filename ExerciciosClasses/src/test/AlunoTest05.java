package test;

import dominio.Aluno;

public class AlunoTest05 {
    public static void main(String[] args) {
        // Exercício 34 - mensagem de aprovação
        Aluno aluno = new Aluno();
        aluno.nome = "Fernanda";
        aluno.nota1 = 6.0;
        aluno.nota2 = 5.5;

        System.out.print("Situação de " + aluno.nome + ": ");
        aluno.imprimirSituacao();
    }
}
