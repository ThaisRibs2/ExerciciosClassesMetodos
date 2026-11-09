package test;

import dominio.Aluno;
import dominio.Secretaria;

public class SecretariaTest01 {
    public static void main(String[] args) {
        // Exercício 49 - atualizar situação do aluno
        Aluno aluno = new Aluno();
        aluno.nome = "João Pedro";
        aluno.nota1 = 3.0;
        aluno.nota2 = 4.0;

        System.out.println("Situação antes: " + aluno.getSituacao());

        Secretaria secretaria = new Secretaria();
        secretaria.atualizarAluno(aluno, 8.0, 9.0);

        System.out.println("Situação depois: " + aluno.getSituacao());
    }
}
