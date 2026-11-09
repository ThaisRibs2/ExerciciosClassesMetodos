package test;

import dominio.Termometro;

public class TermometroTest01 {
    public static void main(String[] args) {
        // Exercício 29 - verificar temperatura
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 38.5;

        double limite = 37.5;
        System.out.println("Temperatura atual: " + termometro.temperaturaAtual);
        System.out.println("Passou do limite de " + limite + "? " + termometro.passouDoLimite(limite));
    }
}
