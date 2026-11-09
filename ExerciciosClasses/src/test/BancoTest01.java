package test;

import dominio.Banco;
import dominio.ContaBancaria;

public class BancoTest01 {
    public static void main(String[] args) {
        // Exercício 46 - transferir dinheiro entre contas
        ContaBancaria origem = new ContaBancaria();
        origem.titular = "Ana Paula";
        origem.saldo = 1000.0;

        ContaBancaria destino = new ContaBancaria();
        destino.titular = "Carlos Souza";
        destino.saldo = 200.0;

        Banco banco = new Banco();

        System.out.println("Transferindo R$ 300...");
        banco.transferir(origem, destino, 300.0);
        System.out.println(origem.titular + ": R$ " + origem.saldo);
        System.out.println(destino.titular + ": R$ " + destino.saldo);

        System.out.println("\nTransferindo R$ 5000...");
        banco.transferir(origem, destino, 5000.0);
        System.out.println(origem.titular + ": R$ " + origem.saldo);
        System.out.println(destino.titular + ": R$ " + destino.saldo);
    }
}
