package com.github.javachaos.javadatastructures.datastructures.lists;

import java.nio.BufferUnderflowException;

public class Stack<T> {

    /**
     * In order to relax the number of realloc's we increase the size of the array
     * by 128 instead of 1.
     */
    private static final int SIZE_LIMIT = 128;
    private int size;
    private Object[] elements;

    public Stack(int initial) {
        if (initial <= 0) {
            throw new IllegalArgumentException("Initial size cannot be less than or equal to zero.");
        }
        this.elements = new Object[initial];
    }

    public Stack() {
        this(10);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem) {
        size++;
        ensureCapacity();
        elements[size] = elem;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        } else {
            size--;
            return (T) elements[size +1];
        }
    }

    /**
     * Resize the underlying array object of this stack
     * in order to ensure capacity.
     * @param size the capacity to ensure
     */
    private void ensureCapacity() {
        if (size <= 0) {
            throw new IllegalArgumentException("Negative size.");
        }
        if (elements.length <= size) {
            Object[] newElements = new Object[size +SIZE_LIMIT];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }
}
