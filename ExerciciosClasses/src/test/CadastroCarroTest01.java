package test;

import dominio.CadastroCarro;
import dominio.Carro;
import dominio.ImpressoraCarro;

public class CadastroCarroTest01 {
    public static void main(String[] args) {
        // Exercício 42 - cadastrar carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Onix", "Chevrolet", 2022, 80);
        cadastro.cadastrar(carro2, "Gol", "Volkswagen", 2008, 60);

        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro1);
        System.out.println("-----");
        impressora.imprime(carro2);
    }
}
