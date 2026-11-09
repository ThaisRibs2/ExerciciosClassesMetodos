package test;

import dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Exercício 28 - bônus do funcionário
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Roberto";
        funcionario.salario = 3000.0;

        double bonus = funcionario.calcularBonus(15);
        System.out.println("Salário de " + funcionario.nome + ": R$ " + funcionario.salario);
        System.out.println("Bônus de 15%: R$ " + bonus);
    }
}
