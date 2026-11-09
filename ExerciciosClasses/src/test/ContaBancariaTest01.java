package test;

import dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        // Exercício 7
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana Paula";
        conta.numeroConta = 12345;
        conta.saldo = 2500.0;

        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da conta: " + conta.numeroConta);
        System.out.println("Saldo: " + conta.saldo);
    }
}
