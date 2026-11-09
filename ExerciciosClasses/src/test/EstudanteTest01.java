package test;

import dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Exercício 1
        Estudante estudante = new Estudante();
        estudante.nome = "Maria Silva";
        estudante.idade = 20;
        estudante.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
