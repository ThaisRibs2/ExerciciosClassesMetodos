package test;

import dominio.Aluno;

public class AlunoTest02 {
    public static void main(String[] args) {
        // Exercício 11 - média do aluno
        Aluno aluno = new Aluno();
        aluno.nome = "João Pedro";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.5;

        double media = aluno.calcularMedia();
        System.out.println("A média de " + aluno.nome + " é: " + media);
    }
}
