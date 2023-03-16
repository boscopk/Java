package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorQRCodeTest {

    @Test
    void testLeitorQRCode(){
        LeitorQRCode leitorQRCode = new LeitorQRCode();
        SistemaControleVendas sistema = new SistemaControleVendas();
        sistema.setLeitorCodigo(leitorQRCode);
        assertEquals(leitorQRCode,sistema.getLeitorCodigo());

        assertEquals("qrCode",sistema.getLeitorCodigo().lerCodigo());
    }
}