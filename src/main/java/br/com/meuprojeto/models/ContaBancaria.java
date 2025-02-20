package br.com.meuprojeto.models;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

}
