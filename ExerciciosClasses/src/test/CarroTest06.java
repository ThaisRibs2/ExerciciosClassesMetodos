package test;

import dominio.Carro;

public class CarroTest06 {
    public static void main(String[] args) {
        // Exercício 38 - aumentar velocidade do carro
        Carro carro = new Carro();
        carro.nome = "Civic";
        carro.velocidadeAtual = 40;

        System.out.println("Velocidade antes: " + carro.velocidadeAtual);
        carro.acelerar(35);
        System.out.println("Velocidade depois: " + carro.velocidadeAtual);
    }
}
