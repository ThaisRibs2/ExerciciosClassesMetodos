package test;

import dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        // Exercício 3
        Carro carro1 = new Carro();
        carro1.nome = "Gol";
        carro1.modelo = "Volkswagen";
        carro1.ano = 2008;

        Carro carro2 = new Carro();
        carro2.nome = "Onix";
        carro2.modelo = "Chevrolet";
        carro2.ano = 2022;

        System.out.println("Carro 1: " + carro1.nome + " | " + carro1.modelo + " | " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " | " + carro2.modelo + " | " + carro2.ano);
    }
}
