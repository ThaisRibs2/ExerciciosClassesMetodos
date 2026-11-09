package test;

import dominio.Carro;
import dominio.Oficina;

public class OficinaTest01 {
    public static void main(String[] args) {
        // Exercício 47 - trocar velocidades entre carros
        Carro carro1 = new Carro();
        carro1.nome = "Onix";
        carro1.velocidadeAtual = 80;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.velocidadeAtual = 50;

        System.out.println("ANTES:");
        System.out.println(carro1.nome + ": " + carro1.velocidadeAtual);
        System.out.println(carro2.nome + ": " + carro2.velocidadeAtual);

        Oficina oficina = new Oficina();
        oficina.trocarVelocidades(carro1, carro2);

        System.out.println("\nDEPOIS:");
        System.out.println(carro1.nome + ": " + carro1.velocidadeAtual);
        System.out.println(carro2.nome + ": " + carro2.velocidadeAtual);
    }
}
