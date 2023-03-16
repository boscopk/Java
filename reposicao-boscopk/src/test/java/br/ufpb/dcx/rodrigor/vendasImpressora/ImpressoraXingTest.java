package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressoraXingTest {

    @Test
    void testXing(){
        ImpressoraXing impressora = new ImpressoraXing();

        SistemaControleVendas sistema = new SistemaControleVendas();
        sistema.setImpressora(impressora);

        assertEquals(impressora,sistema.getImpressora());

    }

}