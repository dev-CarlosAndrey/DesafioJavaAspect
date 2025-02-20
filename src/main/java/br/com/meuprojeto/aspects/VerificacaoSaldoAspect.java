package br.com.meuprojeto.aspects;

import br.com.meuprojeto.models.ContaBancaria;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class VerificacaoSaldoAspect {

    @Pointcut("execution(void ContaBancaria.sacar(double)) && args(valor)")
    public void verificaSaldo(double valor) {}

    @Before("verificaSaldo(valor")
    public void antesDoSaque(JoinPoint joinPoint, double valor){
        ContaBancaria conta = (ContaBancaria) joinPoint.getTarget();

        if(conta.getSaldo() < valor) {
            System.out.println("[LOG] ERRO: Saldo insuficiente na conta de " + conta.getTitular() + " para saque de R$: " + valor );
        }
    }
}
