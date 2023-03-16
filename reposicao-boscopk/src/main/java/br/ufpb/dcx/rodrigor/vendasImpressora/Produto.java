package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.math.BigDecimal;

public class Produto {

    private BigDecimal valor;
    private String id;
    private String nome;


    public Produto(){
        this("","",new BigDecimal(0));
    }

    public Produto(String id, String nome, Double valor){
        this(id,nome,new BigDecimal(valor));
    }

    public Produto(String id, String nome, BigDecimal valor){
        this.id = id;
        this.nome = nome;
        this.setValor(valor);
    }

    public BigDecimal getValor() {
        return valor;
    }


    public void setValor(Double valor){
        this.setValor(new BigDecimal(valor));
    }

    public void setValor(BigDecimal valor) {
        if(valor.signum() < 0)
            throw new IllegalArgumentException("O valor do produto não pode ser negativo");
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
