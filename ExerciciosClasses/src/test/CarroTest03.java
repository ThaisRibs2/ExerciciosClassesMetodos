package test;

import dominio.Carro;

public class CarroTest03 {
    public static void main(String[] args) {
        // Exercício 23 - verificar multa
        Carro carro1 = new Carro();
        carro1.nome = "Onix";
        carro1.velocidadeAtual = 95;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.velocidadeAtual = 60;

        int limiteDaVia = 80;
        System.out.println(carro1.nome + " foi multado? " + carro1.isMultado(limiteDaVia));
        System.out.println(carro2.nome + " foi multado? " + carro2.isMultado(limiteDaVia));
    }
}
