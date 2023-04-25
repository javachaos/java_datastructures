package com.github.javachaos.javadatastructures.datastructures.lists;

import java.nio.BufferUnderflowException;

public class Queue<T> {

    private static final int EXTRA_CAPACITY = 1;

    int head;
    int tail;
    Object[] elements;
    int size;

    public Queue(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    public Queue() {
        this(10);
    }

    public void offer(T elem) {
        ensureCapacity();
        elements[tail] = elem;
        if (tail == elements.length-1) {
            tail = 0;
        } else {
            tail++;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T poll() {
        if (isEmpty()) {
            throw new BufferUnderflowException();
        }
        T x = (T) elements[head];
        if (head == elements.length-1) {
            head = 0;
        } else {
            head++;
        }
        size--;
        return x;
    }

    /**
     * Resize the underlying array object of this stack
     * in order to ensure capacity.
     */
    private void ensureCapacity() {
        if (size < 0) {
            throw new IllegalArgumentException("Negative size.");
        }
        if (!isEmpty()) {
            if (head == tail + 1) {
                Object[] newElements = new Object[size + EXTRA_CAPACITY];
                System.arraycopy(elements, 0, newElements, 0, tail + 1);
                int hLen = elements.length - head;
                System.arraycopy(elements, head, newElements,
                        newElements.length - hLen,
                        hLen);

                elements = newElements;
            }
            if (head == 0 && tail == elements.length-1) {
                Object[] newElements = new Object[size + EXTRA_CAPACITY];
                System.arraycopy(elements, 0, newElements, 0, elements.length);
                elements = newElements;
            }
        }
    }

}
