package br.ufpb.dcx.rodrigor.banco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void getValor() {
        Transacao transacao = new Transacao(0.0);

        Exception _e = assertThrows(IllegalArgumentException.class, ()-> transacao.getValor());
        assertEquals("Este valor não pode ser igual a zero ou negativo!!",_e.getMessage());

    }
}