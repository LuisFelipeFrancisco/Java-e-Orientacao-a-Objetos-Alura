package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.PERFORMANCE;

public class ReadjustServiceTest {
    
    @Test
    public void readjustmentShouldBe3PercentForPoorPerformance() {
        ReadjustService service = new ReadjustService();
        Funcionario funcionario = new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("1000.00"));

        service.readjustment(funcionario, PERFORMANCE.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void readjustmentShouldBe15PercentForGoodPerformance() {
        ReadjustService service = new ReadjustService();
        Funcionario funcionario = new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("1000.00"));

        service.readjustment(funcionario, PERFORMANCE.BOA);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void readjustmentShouldBe20PercentForExcellentPerformance() {
        ReadjustService service = new ReadjustService();
        Funcionario funcionario = new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("1000.00"));

        service.readjustment(funcionario, PERFORMANCE.EXCELENTE);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
