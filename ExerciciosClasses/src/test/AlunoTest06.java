package test;

import dominio.Aluno;

public class AlunoTest06 {
    public static void main(String[] args) {
        // Exercício 40 - atualizar nota do aluno
        Aluno aluno = new Aluno();
        aluno.nome = "João Pedro";
        aluno.nota1 = 4.0;
        aluno.nota2 = 5.0;

        System.out.println("Média antiga: " + aluno.calcularMedia());

        aluno.atualizarNotas(8.0, 9.0);

        System.out.println("Média nova: " + aluno.calcularMedia());
    }
}
