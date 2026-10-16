package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {
    @Test 
    void deveSomarAsTresNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(20, 20, 30);
        assertEquals(70, resultado);
    }

    @Test 
    void deveSomarOutrasNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(10, 15, 25);
        assertEquals(50, resultado);
    }

    @Test
    void deveAprovarComNota70() {
        CalculadoraNota calc = new CalculadoraNota();
        assertTrue(calc.estaAprovadoPorNota(70));
    }

    @Test
    void deveReprovarComNota69() {
        CalculadoraNota calc = new CalculadoraNota();
        assertFalse(calc.estaAprovadoPorNota(69));
    }

    @Test 
    void deveRejeitarA1MaiorQue30() {
        CalculadoraNota calc = new CalculadoraNota();
        assertThrows(IllegalArgumentException.class, () -> calc.calcularNotaFinal(35, 20, 30));
    }

    @Test
void deveSubstituirA1PelaNotaAI() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals(75, calc.aplicarAI(10, 20, 30, 25));
}

@Test
void deveSubstituirA2PelaNotaAI() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals(75, calc.aplicarAI(20, 10, 30, 25));
}

@Test
void deveManterAsNotasQuandoAIForMenor() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals(60, calc.aplicarAI(20, 25, 15, 10));
}

@Test
void deveRejeitarNotaAIInvalida() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
            () -> calc.aplicarAI(10, 20, 30, 35));
}

}