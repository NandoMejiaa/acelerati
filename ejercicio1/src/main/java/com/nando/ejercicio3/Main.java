package com.nando.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> fuente = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<Integer> destino = new ArrayList<>();

        ListaUtil listaUtil = new ListaUtil();
        listaUtil.addOddElements(fuente, destino);

        System.out.println("Fuente: " + fuente);
        System.out.println("Destino (solo posiciones impares): " + destino);
    }
}
