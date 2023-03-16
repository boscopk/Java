package br.ufpb.dcx.rodrigor.banco;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Conta {



    private List<Transacao> transacoes = new LinkedList<>();


    public void depositar(double valor){
        if(valor < 0)
            throw new IllegalArgumentException("Não é possível depositar um valor menor que zero");
        else if(valor == 0.0)
            throw new IllegalArgumentException("Não é possível depositar um valor igual a zero");
        this.transacoes.add(new Transacao(valor));
    }

    public void sacar(double valor){
        BigDecimal b = new BigDecimal(valor);
        if (b.compareTo(this.getSaldo()) > 0) {
            throw new IllegalArgumentException("bandido");
        }
        else if (valor < 0)
            throw new IllegalArgumentException("Não é possível sacar um valor menor que zero");
        else if (valor == 0)
            throw new IllegalArgumentException("Não é possível sacar um valor igual a zero");

        this.transacoes.add(new Transacao(-valor));
    }

    public BigDecimal getSaldo(){
        BigDecimal saldoTemp = new BigDecimal(0);
        for (Transacao x : transacoes){
            saldoTemp = saldoTemp.add(x.getValor());
        }
        return saldoTemp;
    }

    List<Transacao> getTransacoes(){
        return this.transacoes;
    }
}
