package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.math.BigDecimal;

public class ItemPedido {


    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }


    public BigDecimal getTotalItem(){
        return this.produto.getValor().multiply(new BigDecimal(quantidade));
    }

    public ItemPedido(Produto produto){
        this(produto,1);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto == null) {
            throw new IllegalArgumentException("produto não pode ser null!");
        }
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0 ) {
            throw new IllegalArgumentException("quantidade invalida!");
        }
        this.quantidade = quantidade;
    }

    public void incrementar() {
        this.quantidade++;
    }

    public void incrementar(int quant){
        this.quantidade+=quant;
    }
}
