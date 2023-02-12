package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.PERFORMANCE;

public class ReadjustService {

    public void readjustment(Funcionario funcionario, PERFORMANCE desempenho) {
        BigDecimal readjustment = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.readjust(readjustment);
    }
    
}