package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	/**
	 * > The bonus should be zero for salary greater than 10,000
	 */
	@Test
	void bonusShouldBeZeroForSalaryGreaterThan10000() {
		BonusService service = new BonusService();

		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Felipe", LocalDate.now(), new BigDecimal("25000"))));
		/*
		try {
			service.calcularBonus(new Funcionario("Felipe", LocalDate.now(), new BigDecimal("25000")));
			fail("Não deu a exceção");
		} catch (Exception e) {
			assertEquals("Funcionario com salario maior que R$ 10.000,00 nao pode receber bonus!", e.getMessage());
		}
		*/
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
	void bonusShouldBeZeroForSalaryEquals10000 () {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Luis Felipe", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus); 
	}

}
