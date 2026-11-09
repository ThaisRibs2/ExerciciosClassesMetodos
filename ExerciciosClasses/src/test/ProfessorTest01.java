package test;

import dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        // Exercício 2
        Professor professor = new Professor();
        professor.nome = "Carlos Souza";
        professor.idade = 42;
        professor.disciplina = "Matemática";
        professor.salario = 5500.0;

        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Disciplina: " + professor.disciplina);
        System.out.println("Salário: " + professor.salario);
    }
}
