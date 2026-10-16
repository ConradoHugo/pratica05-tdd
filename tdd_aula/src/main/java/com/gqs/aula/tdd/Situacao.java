package com.gqs.aula.tdd;

public class Situacao {

    public String situacao(double notaFinal, double frequencia) {
        final double FREQUENCIA_MINIMA = 75.0;

        if (frequencia < FREQUENCIA_MINIMA) {
            return "REPROVADO";
        }

        if (notaFinal >= 70) {
            return "APROVADO";
        }

        return "REPROVADO";
    }
}