package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void getTotalPedido() {

        Pedido pedido = new Pedido();
        assertEquals(new BigDecimal(0.0),pedido.getTotalPedido());

        pedido.adicionarProduto(new Produto("sapato","Sapato",10.0),2);
        assertEquals(new BigDecimal(20.0),pedido.getTotalPedido());
        pedido.adicionarProduto(new Produto("meia","Meia",3.0),3);
        assertEquals(new BigDecimal(29.0),pedido.getTotalPedido());


    }
}