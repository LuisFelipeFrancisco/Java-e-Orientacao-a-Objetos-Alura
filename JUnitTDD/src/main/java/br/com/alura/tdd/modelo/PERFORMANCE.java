package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum PERFORMANCE {
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    }, BOA {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    }, EXCELENTE {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal percentualReajuste();

}