package test;

import dominio.Carro;

public class CarroTest07 {
    public static void main(String[] args) {
        // Exercício 39 - frear o carro
        Carro carro = new Carro();
        carro.nome = "Civic";
        carro.velocidadeAtual = 60;

        carro.frear(25);
        System.out.println("Velocidade após frear 25: " + carro.velocidadeAtual);

        carro.frear(100); // a velocidade não pode ficar menor que zero
        System.out.println("Velocidade após frear 100: " + carro.velocidadeAtual);
    }
}
