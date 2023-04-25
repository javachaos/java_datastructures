package com.github.javachaos.javadatastructures.datastructures.lists;

import java.util.Objects;

public class DoubleLinkedList<T> {
    ListNode head;
    ListNode tail;

    public void insertFront(DoubleLinkedList<T> dll, ListNode n) {
        n.next = dll.head;
        if (dll.head != null) {
            dll.head.prev = n;
        }
        dll.head = n;
        n.prev = null;
    }

    public ListNode search(DoubleLinkedList<T> dll, ListNode k) {
        ListNode x = dll.head;
        while (x != null && x.data.equals(k)) {
            x = x.next;
        }
        return x;
    }

    public void delete(DoubleLinkedList<T> dll, ListNode x) {
        if (x.prev != null) {
            x.prev.next = x.next;
        } else {
            dll.head = x.next;
        }
        if (x.next != null) {
            x.next.prev = x.prev;
        }
    }


    class ListNode {
        ListNode prev;
        T data;
        ListNode next;

        public ListNode(T data, ListNode prev, ListNode next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }

        public ListNode getPrev() {
            return prev;
        }

        public T get() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            @SuppressWarnings("unchecked")
            ListNode listNode = (ListNode) o;
            return Objects.equals(prev, listNode.prev) && Objects.equals(data, listNode.data) && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(prev, data, next);
        }
    }

}
