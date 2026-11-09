package test;

import dominio.Carro;
import dominio.ImpressoraCarro;

public class ImpressoraCarroTest01 {
    public static void main(String[] args) {
        // Exercício 32 - imprimir dados do carro
        Carro carro1 = new Carro();
        carro1.nome = "Onix";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2022;
        carro1.velocidadeAtual = 80;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.modelo = "Volkswagen";
        carro2.ano = 2008;
        carro2.velocidadeAtual = 60;

        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro1);
        System.out.println("-----");
        impressora.imprime(carro2);
    }
}
