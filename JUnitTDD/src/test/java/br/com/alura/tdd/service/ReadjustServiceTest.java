package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.PERFORMANCE;

public class ReadjustServiceTest {

    private ReadjustService service;
    private Funcionario funcionario;

    @BeforeEach
    public void initialize() {
        this.service = new ReadjustService();
        this.funcionario = new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("1000.00"));
    }
    
    @Test
    public void readjustmentShouldBe3PercentForPoorPerformance() {
        service.readjustment(funcionario, PERFORMANCE.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void readjustmentShouldBe15PercentForGoodPerformance() {
        service.readjustment(funcionario, PERFORMANCE.BOA);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void readjustmentShouldBe20PercentForExcellentPerformance() {
        service.readjustment(funcionario, PERFORMANCE.EXCELENTE);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}

/*
 * JUnit annotations
 * @BeforeEach - > This annotation is used to execute a method before each test
 * @AfterEach - > This annotation is used to execute a method after each test
 * @BeforeAll - > This annotation is used to execute a method before all tests, must be static
 * @AfterAll - > This annotation is used to execute a method after all tests, must be static
 * @Test - > This annotation is used to execute a method as a test
 * @Disabled - > This annotation is used to disable a test
 */