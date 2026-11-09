package test;

import dominio.Celular;

public class CelularTest02 {
    public static void main(String[] args) {
        // Exercício 20 - celular premium
        Celular celular1 = new Celular();
        celular1.marca = "Apple";
        celular1.modelo = "iPhone 16";
        celular1.preco = 7500.0;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "Moto G";
        celular2.preco = 1300.0;

        System.out.println(celular1.marca + " " + celular1.modelo + " é premium? " + celular1.isPremium());
        System.out.println(celular2.marca + " " + celular2.modelo + " é premium? " + celular2.isPremium());
    }
}
