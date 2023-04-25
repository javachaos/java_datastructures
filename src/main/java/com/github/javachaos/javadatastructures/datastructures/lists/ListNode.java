package com.github.javachaos.javadatastructures.datastructures.lists;

public class ListNode<T> {
    ListNode<T> prev;
    T data;
    ListNode<T> next;

    public ListNode( T data, ListNode<T> prev, ListNode<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public T get() {
       return data;
    }
}
