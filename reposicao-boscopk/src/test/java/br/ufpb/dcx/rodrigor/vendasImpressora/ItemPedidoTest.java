package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ItemPedidoTest {

    @Test
    void getTotalItem() {
        assertEquals(new BigDecimal(0),new ItemPedido(new Produto("qq","qualquer",0.0)).getTotalItem());
        assertEquals(new BigDecimal(10.0),new ItemPedido(new Produto("qq","qualquer",10.0)).getTotalItem());
    }

    @Test
    void testNovoItem(){
        Exception e = assertThrows(IllegalArgumentException.class,() -> new ItemPedido(null));
        assertEquals("produto não pode ser null!",e.getMessage());
        e = assertThrows(IllegalArgumentException.class,() -> new ItemPedido(new Produto("xx","XXX",10.0),0));
        assertEquals("quantidade invalida!",e.getMessage());
        e = assertThrows(IllegalArgumentException.class,() -> new ItemPedido(new Produto("xx","XXX",10.0),-1));
        assertEquals("quantidade invalida!",e.getMessage());
    }
}