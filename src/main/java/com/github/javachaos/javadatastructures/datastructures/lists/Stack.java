package com.github.javachaos.javadatastructures.datastructures.lists;

import java.nio.BufferUnderflowException;

public class Stack<T> {

    private int top;
    private int capacity;
    private Object[] elements;

    public Stack(int initial) {
        if (initial <= 0) {
            throw new IllegalArgumentException("Initial size cannot be less than or equal to zero.");
        }
        this.elements = new Object[initial];
        this.capacity = initial;
    }

    public Stack() {
        this(10);
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(T elem) {
        if (top + 1 > capacity) {
            resize(top * 2);
        }
        elements[top++] = elem;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        } else {
            top--;
            if ((top+1) * 2 < elements.length) {
                resize(elements.length / 2 + 1);
            }
            return (T) elements[top + 1];
        }
    }

    /**
     * Resize the underlying array object of this stack
     * @param capacity the new capacity of the underlying array for this stack
     */
    private void resize(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Negative size.");
        }
        Object[] newElements = new Object[capacity];
        if (capacity > elements.length) {
            System.arraycopy(elements, 0, newElements, 0, elements.length);
        } else if (capacity < elements.length) {
            System.arraycopy(elements, 0, newElements, 0, newElements.length);
        }
        this.capacity = newElements.length;
        elements = newElements;
    }
}
