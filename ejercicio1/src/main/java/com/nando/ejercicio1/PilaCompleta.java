package com.nando.ejercicio1;

import java.util.Collection;
import java.util.Stack;

public class PilaCompleta<T> extends Stack<T> {

    public void pushAll(Collection<? extends T> items) {
        for (T item : items) {
            this.push(item);
        }
    }

    public Collection<T> popAll() {
        Stack<T> poppedItems = new Stack<>();
        while (!this.isEmpty()) {
            poppedItems.push(this.pop());
        }
        return poppedItems;
    }
}
