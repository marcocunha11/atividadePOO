package com.cotemig;

public class Banco {

    public String nome;
    public int agencia;
    public int cnpj;

    public Banco(String nome, int agencia, int cnpj){
        this.nome = nome;
        this.agencia = agencia;
        this.cnpj = cnpj;
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("CNPJ: " + cnpj);
    }

}
