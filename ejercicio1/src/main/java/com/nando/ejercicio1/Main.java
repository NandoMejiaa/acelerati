package com.nando.ejercicio1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PilaCompleta<Integer> pila = new PilaCompleta<>();

        // PushAll
        pila.pushAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Pila después de pushAll: " + pila);

        // PopAll
        System.out.println("Elementos sacados con popAll: " + pila.popAll());
        System.out.println("Pila después de popAll: " + pila);
    }
}
