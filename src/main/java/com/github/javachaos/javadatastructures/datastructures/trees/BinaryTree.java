package com.github.javachaos.javadatastructures.datastructures.trees;

public class BinaryTree<T extends Comparable<T>> {
    private record Node<T>(T data, Node<T> parent, Node<T> left, Node<T> right){}

    public void inorderPrint(Node<T> root) {
        if (root != null) {
            inorderPrint(root.left);
        }
        if (root != null) {
            System.out.println(root.data);
        } else {
            System.out.println("null");
        }
        inorderPrint(root.left);
    }

    public T search(Node<T> root, T key) {
        if (root == null || key.equals(root.data)) {
            if (root == null) {
                return null;
            } else {
                return root.data;
            }
        }
        if (key.compareTo(root.data) < 0) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public T searchIter(Node<T> root, T key) {
        while (root != null && !key.equals(root.data)) {
            if (key.compareTo(root.data) < 0) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        if (root == null) {
            return null;
        } else {
            return root.data;
        }
    }

    public T min(Node<T> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public T max(Node<T> root) {
        while(root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public T successor(Node<T> x) {
        if (x.right != null) {
            return min(x.right);
        }
        Node<T> y = x.parent;
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }
        if (y == null) {
            return null;
        }
        return y.data;
    }
}
