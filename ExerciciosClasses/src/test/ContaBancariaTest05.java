package test;

import dominio.ContaBancaria;

public class ContaBancariaTest05 {
    public static void main(String[] args) {
        // Exercício 37 - sacar da conta
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana Paula";
        conta.saldo = 1000.0;

        System.out.println("Saldo inicial: R$ " + conta.saldo);

        System.out.println("\nTentando sacar R$ 400 (valor válido)...");
        conta.sacar(400.0);
        System.out.println("Saldo atual: R$ " + conta.saldo);

        System.out.println("\nTentando sacar R$ 900 (maior que o saldo)...");
        conta.sacar(900.0);
        System.out.println("Saldo atual: R$ " + conta.saldo);
    }
}
