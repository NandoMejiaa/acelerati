package com.nando.ejercicio2;

import java.util.HashMap;

public class NonNullMap<K, V> extends HashMap<K, V> {

    @Override
    public V put(K key, V value) {
        if (value == null) {
            throw new RuntimeException("NO SE PREMITE AGREGAR NULOS");
        }
        return super.put(key, value);
    }
}