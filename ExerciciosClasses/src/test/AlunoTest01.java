package test;

import dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        // Exercício 10
        Aluno aluno = new Aluno();
        aluno.nome = "João Pedro";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.5;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
    }
}
