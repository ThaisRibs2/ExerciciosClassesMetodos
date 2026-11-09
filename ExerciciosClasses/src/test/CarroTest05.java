package test;

import dominio.Carro;

public class CarroTest05 {
    public static void main(String[] args) {
        // Exercício 35 - mensagem de multa
        Carro carro1 = new Carro();
        carro1.nome = "Onix";
        carro1.velocidadeAtual = 100;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.velocidadeAtual = 70;

        int limiteDaVia = 80;
        System.out.print(carro1.nome + ": ");
        carro1.imprimirMulta(limiteDaVia);
        System.out.print(carro2.nome + ": ");
        carro2.imprimirMulta(limiteDaVia);
    }
}
