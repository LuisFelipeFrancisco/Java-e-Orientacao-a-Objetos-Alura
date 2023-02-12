package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	/**
	 * > The bonus should be zero for salary under 10000
	 */
	@Test
	void bonusShouldBeZeroForSalaryUnder10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Luis", LocalDate.now(), new BigDecimal("25000")));

		assertEquals(new BigDecimal("0.00"), bonus);
	}

	/**
	 * > The function should return 10% of the salary
	 */
	@Test
	void bonusShouldBe10PercentOfSalary() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Felipe", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	/* @Test
	void bonus(){
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("100.00"), bonus); // > This test will fail Expected :100.00 Actual :1000
	} */

	@Test
	void bonusShould10PercentForSalary10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus); 
	}

}
