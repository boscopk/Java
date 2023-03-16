package br.ufpb.dcx.rodrigor.banco;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void depositar() {
        Conta conta = new Conta();

        conta.depositar(10.0);
        assertEquals(new BigDecimal(10.0),conta.getSaldo());

        Exception e = assertThrows(IllegalArgumentException.class, ()-> conta.depositar(-50.0));
        assertEquals("Não é possível depositar um valor menor que zero",e.getMessage());

        e = assertThrows(IllegalArgumentException.class, ()-> conta.depositar(0.0));
        assertEquals("Não é possível depositar um valor igual a zero",e.getMessage());

    }

    @Test
    void sacar() {
        Conta conta = new Conta();

        Exception e = assertThrows(IllegalArgumentException.class, ()-> conta.sacar(-10.0));
        assertEquals("Não é possível sacar um valor menor que zero",e.getMessage());

        e = assertThrows(IllegalArgumentException.class, ()-> conta.sacar(0.0));
        assertEquals("Não é possível sacar um valor igual a zero",e.getMessage());

    }

    @Test
    void getSaldo() {
        Conta conta = new Conta();

        // Quando criada, uma conta deve ter saldo zero
        assertEquals(new BigDecimal(0.0),conta.getSaldo());

        conta.depositar(10.0);
        assertEquals(new BigDecimal(10.0),conta.getSaldo());

        conta.depositar(10.0);
        assertEquals(new BigDecimal(20.0),conta.getSaldo());

        conta.sacar(5.0);
        assertEquals(new BigDecimal(15.0),conta.getSaldo());

        // Não é possível sacar um valor maior que o saldo da conta.
        // A classe conta deve lançar uma exceção qualquer quando
        // o valor sacado for maior que o saldo da conta.
        assertThrows(Exception.class, () -> conta.sacar(20));

    }
}