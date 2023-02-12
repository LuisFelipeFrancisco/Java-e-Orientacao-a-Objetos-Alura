package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.PERFORMANCE;

public class ReadjustService {

    public void readjustment(Funcionario funcionario, PERFORMANCE desempenho) {
        if (desempenho == PERFORMANCE.A_DESEJAR) {
            BigDecimal readjustment =  funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.readjust(readjustment);
        }
        else if (desempenho == PERFORMANCE.BOA) {
            BigDecimal readjustment =  funcionario.getSalario().multiply(new BigDecimal("0.15"));
            funcionario.readjust(readjustment);
        }
        else if (desempenho == PERFORMANCE.EXCELENTE) {
            BigDecimal readjustment =  funcionario.getSalario().multiply(new BigDecimal("0.20"));
            funcionario.readjust(readjustment);
        }
    }
    
}