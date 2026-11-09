package test;

import dominio.Animal;

public class AnimalTest01 {
    public static void main(String[] args) {
        // Exercício 8
        Animal animal1 = new Animal();
        animal1.nome = "Rex";
        animal1.especie = "Cachorro";
        animal1.idade = 5;

        Animal animal2 = new Animal();
        animal2.nome = "Mimi";
        animal2.especie = "Gato";
        animal2.idade = 3;

        System.out.println("Animal 1: " + animal1.nome + " | " + animal1.especie + " | " + animal1.idade + " anos");
        System.out.println("Animal 2: " + animal2.nome + " | " + animal2.especie + " | " + animal2.idade + " anos");
    }
}
