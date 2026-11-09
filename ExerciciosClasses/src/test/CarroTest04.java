package test;

import dominio.Carro;

public class CarroTest04 {
    public static void main(String[] args) {
        // Exercício 24 - mensagem da multa
        Carro carro = new Carro();
        carro.nome = "Civic";
        carro.velocidadeAtual = 110;

        String mensagem = carro.gerarMensagemMulta(80);
        System.out.println(carro.nome + ": " + mensagem);
    }
}
