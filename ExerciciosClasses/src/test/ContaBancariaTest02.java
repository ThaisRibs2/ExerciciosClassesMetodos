package test;

import dominio.ContaBancaria;

public class ContaBancariaTest02 {
    public static void main(String[] args) {
        // Exercício 17 - conta com saldo positivo
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana Paula";
        conta.saldo = 350.0;

        if (conta.temSaldo()) {
            System.out.println("A conta de " + conta.titular + " tem saldo.");
        } else {
            System.out.println("A conta de " + conta.titular + " não tem saldo.");
        }
    }
}
