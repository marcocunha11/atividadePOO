package com.cotemig;

public class Conta {

    public int numero_conta;
    public String data_cria;
    public double saldo;
    public int agencia_conta;

    public Conta(int numero_conta, String data_cria, int agencia_conta){
        this.numero_conta = numero_conta;
        this.data_cria = data_cria;
        this.agencia_conta = agencia_conta;

        this.saldo = 0;
    }

    public void depositar(double valor){

        if(valor > 0){
            saldo += valor;
            System.out.println("Depositado: R$" + valor);
            System.out.println("Saldo atual: R$" + saldo);
       }
        else{
            System.out.println("Impossível de depositar!");
        }

    }

    public void sacar(double valor){

        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Sacado: R$" + valor);
            System.out.println("Saldo atual: R$" + saldo);
        }
        else{
            System.out.println("Impossível de sacar!");
        }

    }

    public double consulta_saldo(){
        return saldo;
    }

    public void imprimirInfo(){
        System.out.println("Número da conta: " + numero_conta);
        System.out.println("Agencia: " + agencia_conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Data de criação: " + data_cria);

    }

}
