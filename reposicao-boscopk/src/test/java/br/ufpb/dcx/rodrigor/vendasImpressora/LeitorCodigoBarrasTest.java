package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorCodigoBarrasTest {


    @Test
    void testLeitorCodigoBarras(){
        LeitorCodigoBarras leitorCodigoBarras = new LeitorCodigoBarras();
        SistemaControleVendas sistema = new SistemaControleVendas();
        sistema.setLeitorCodigo(leitorCodigoBarras);
        assertEquals(leitorCodigoBarras,sistema.getLeitorCodigo());

        assertEquals("codigoBarras",sistema.getLeitorCodigo().lerCodigo());

    }

}