package test;

import dominio.ContaBancaria;

public class ContaBancariaTest04 {
    public static void main(String[] args) {
        // Exercício 36 - depositar na conta
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana Paula";
        conta.saldo = 1000.0;

        System.out.println("Saldo antes: R$ " + conta.saldo);
        conta.depositar(350.0);
        System.out.println("Saldo depois: R$ " + conta.saldo);
    }
}
