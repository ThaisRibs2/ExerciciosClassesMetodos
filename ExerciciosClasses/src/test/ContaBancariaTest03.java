package test;

import dominio.ContaBancaria;

public class ContaBancariaTest03 {
    public static void main(String[] args) {
        // Exercício 26 - limite de saque
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana Paula";
        conta.saldo = 500.0;

        System.out.println("Saldo: R$ " + conta.saldo);
        System.out.println("Pode sacar R$ 200? " + conta.podeSacar(200));
        System.out.println("Pode sacar R$ 500? " + conta.podeSacar(500));
        System.out.println("Pode sacar R$ 800? " + conta.podeSacar(800));
    }
}
