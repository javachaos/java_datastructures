package com.github.javachaos.javadatastructures.datastructures.lists;

import java.nio.BufferUnderflowException;

public class Queue<T> {

    int head;
    int tail;
    Object[] elements;
    int size;
    int capacity;

    public Queue(int initialCapacity) {
        this.elements = new Object[initialCapacity];
        this.capacity = initialCapacity;
    }

    public Queue() {
        this(10);
    }

    public void offer(T elem) {
        if (capacity < size + 1) {
            resize(size * 2);
        }
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
        if (size * 2 < elements.length) {
            resize(elements.length / 2);
        }
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

    public void resize(int newCapacity) {
        // Create a new array with the desired capacity
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = elements[(head + i) % elements.length];
        }
        capacity = newArray.length;
        head = 0;
        tail = size;

        // Set the queueArray reference to the new array
        elements = newArray;
    }

}
