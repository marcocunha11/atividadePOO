package com.cotemig;

public class Cliente {

    public String nome;
    public int cpf;
    public String endereco;
    public Conta conta;

    public Cliente(String nome, int cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void associarConta(Conta conta){
        this.conta = conta;
    }

    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("Endereco: " + endereco);
        if(conta != null){
            conta.imprimirInfo();
        }


    }
}
