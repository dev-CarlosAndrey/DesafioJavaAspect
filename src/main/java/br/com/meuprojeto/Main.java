package br.com.meuprojeto;

import br.com.meuprojeto.models.ContaBancaria;
import br.com.meuprojeto.models.ContaCorrente;

public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("João", 1000);

        conta.sacar(2000);
    }
}
