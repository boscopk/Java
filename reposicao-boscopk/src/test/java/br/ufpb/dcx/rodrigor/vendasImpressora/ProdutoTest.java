package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {


    @Test
    void testarValor(){

        Exception e = assertThrows(IllegalArgumentException.class,() -> new Produto("sapato","Sapato social",-1.0));
        assertEquals("O valor do produto não pode ser negativo",e.getMessage());
    }

}