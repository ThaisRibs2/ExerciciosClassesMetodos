package test;

import dominio.Aluno;

public class AlunoTest03 {
    public static void main(String[] args) {
        // Exercício 12 - verificar aprovação
        Aluno aluno = new Aluno();
        aluno.nome = "Beatriz";
        aluno.nota1 = 9.0;
        aluno.nota2 = 7.0;

        if (aluno.isAprovado()) {
            System.out.println(aluno.nome + " foi aprovado(a)!");
        } else {
            System.out.println(aluno.nome + " foi reprovado(a).");
        }
    }
}
