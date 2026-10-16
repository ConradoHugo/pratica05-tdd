package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SituacaoTest {

    @Test
    public void deveAprovarComNotaEFrequenciaSuficientes() {
        Situacao situacao = new Situacao();
        assertEquals("APROVADO", situacao.situacao(80, 90));
    }

    @Test
    public void deveReprovarComNotaBaixa() {
        Situacao situacao = new Situacao();
        assertEquals("REPROVADO", situacao.situacao(60, 90));
    }

    @Test
    public void deveReprovarPorFrequenciaMesmoComNotaAlta() {
        Situacao situacao = new Situacao();
        assertEquals("REPROVADO", situacao.situacao(95, 74));
    }

    @Test
    public void deveAprovarComFrequenciaExatamente75() {
        Situacao situacao = new Situacao();
        assertEquals("APROVADO", situacao.situacao(70, 75));
    }
}