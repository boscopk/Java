package br.ufpb.dcx.rodrigor.banco;

import java.math.BigDecimal;

public class Transacao {

    private BigDecimal valor = new BigDecimal(0.0);

    public Transacao(Double valor){
        this(new BigDecimal(valor));
    }

    public Transacao(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor(){
        return valor;
    }
}
