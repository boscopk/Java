package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Pedido {

    private LocalDateTime dataHora;
    private Map<String, ItemPedido> itens = new LinkedHashMap<>();

    public Pedido(){
        this.dataHora = LocalDateTime.now();
    }

    public void adicionarProduto(Produto novoProduto){
        this.adicionarProduto(novoProduto,1);
    }

    public void adicionarProduto(Produto produto, int quant){
        if(itens.containsKey(produto.getId())){
            itens.get(produto.getId()).incrementar(quant);
        }else{
            ItemPedido novoItem = new ItemPedido(produto,quant);
            this.itens.put(produto.getId(),novoItem);
        }
    }

    public BigDecimal getTotalPedido(){
        BigDecimal total = new BigDecimal(0);
        for(ItemPedido item: itens.values()){
            total = total.add(item.getTotalItem());
        }
        return total;
    }


}
