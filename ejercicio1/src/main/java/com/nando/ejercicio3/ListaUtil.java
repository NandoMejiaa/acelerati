package com.nando.ejercicio3;

import java.util.List;

public class ListaUtil {
    public static <T> void addOddElements(List<T> source, List<T> target) {
        for (int i = 0; i < source.size(); i += 2) {
            target.add(source.get(i));
        }
    }
}
