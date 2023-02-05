package br.com.alura.test;

import java.util.*;

public class TestArrayVsHashSet {

    public static void main(String[] args) {

        //Collection<Integer> numeros = new ArrayList<Integer>();
        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao + " ms");

    }

}