package test;

import dominio.Celular;

public class CelularTest01 {
    public static void main(String[] args) {
        // Exercício 6
        Celular celular = new Celular();
        celular.marca = "Samsung";
        celular.modelo = "S25";
        celular.armazenamento = 256;
        celular.preco = 4500.0;

        System.out.println("Celular " + celular.marca + " " + celular.modelo
                + " com " + celular.armazenamento + "GB custa R$ " + celular.preco);
    }
}
