package com.cotemig;

public class Main {

    public static void main(String[] args) {

        Banco b1 = new Banco("Meu banco", 01, 1234567);

        Conta c1 = new Conta(1, "21/12/2023", 01);
        Conta c2 = new Conta(2, "05/06/2023", 01);

        Cliente u1 = new Cliente("João", 12345678, "Rua A, 123");
        Cliente u2 = new Cliente("Maria", 98765439, "Rua B, 456");

        u1.associarConta(c1);
        u2.associarConta(c2);

        System.out.println("Informações do banco: ");
        b1.imprimirInfo();
        System.out.println("-----------------------------------");

        System.out.println("Informações do cliente 1: ");
        u1.imprimirInfo();
        System.out.println("-----------------------------------");

        System.out.println("Informações do cliente 2: ");
        u2.imprimirInfo();
        System.out.println("-----------------------------------");

        c1.depositar(5000);
        c1.consulta_saldo();
        System.out.println("-----------------------------------");
        System.out.println("Informações do cliente 1: ");
        u1.imprimirInfo();
        System.out.println("-----------------------------------");

        c1.sacar(1000);
        c1.consulta_saldo();
        System.out.println("-----------------------------------");
        System.out.println("Informações do cliente 1: ");
        u1.imprimirInfo();
        System.out.println("-----------------------------------");
    }
}
