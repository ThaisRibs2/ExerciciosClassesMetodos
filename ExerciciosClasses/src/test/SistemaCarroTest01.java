package test;

import dominio.CadastroCarro;
import dominio.Carro;
import dominio.ImpressoraCarro;

public class SistemaCarroTest01 {
    public static void main(String[] args) {
        // Exercício 50 - sistema completo simples
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Onix", "Chevrolet", 2022, 95);
        cadastro.cadastrar(carro2, "Gol", "Volkswagen", 2008, 60);

        int limiteDaVia = 80;
        ImpressoraCarro impressora = new ImpressoraCarro();

        impressora.imprimir(carro1, limiteDaVia);
        System.out.println("Multado? " + carro1.isMultado(limiteDaVia));
        System.out.println("-----");
        impressora.imprimir(carro2, limiteDaVia);
        System.out.println("Multado? " + carro2.isMultado(limiteDaVia));
    }
}
