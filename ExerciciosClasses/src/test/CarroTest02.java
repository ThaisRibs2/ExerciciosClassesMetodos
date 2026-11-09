package test;

import dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        // Exercício 16 - carro antigo ou novo
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.ano = 1975;

        Carro carro2 = new Carro();
        carro2.nome = "Civic";
        carro2.ano = 2023;

        System.out.println(carro1.nome + ": " + carro1.verificarIdadeDoCarro());
        System.out.println(carro2.nome + ": " + carro2.verificarIdadeDoCarro());
    }
}
