package com.github.javachaos.javadatastructures.datastructures.trees;

public class BinaryTree<T extends Comparable<T>> {
    private static class Node<T> {
        private T data;
        private Node<T> parent;
        private Node<T> right;
        private Node<T> left;
        public Node() { /* unused */ }
    }

    private Node<T> root;

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

    public Node<T> search(Node<T> root, T key) {
        if (root == null || key.equals(root.data)) {
            if (root == null) {
                return null;
            } else {
                return root;
            }
        }
        if (key.compareTo(root.data) < 0) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public Node<T> searchIter(Node<T> root, T key) {
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
            return root;
        }
    }

    public Node<T> min(Node<T> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public Node<T> max(Node<T> root) {
        while(root.right != null) {
            root = root.right;
        }
        return root;
    }

    public Node<T> successor(Node<T> x) {
        if (x.right != null) {
            return min(x.right);
        }
        Node<T> y = x.parent;
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }
        return y;
    }

    public void insert(BinaryTree<T> t, Node<T> z) {
        Node<T> y = null;
        Node<T> x = t.root;
        while (x != null) {
            y = x;
            if (z.data.compareTo(x.data) < 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.parent = y;
        if (y == null) {
            t.root = z;
        } else if(z.data.compareTo(y.data) < 0) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    public void transplant(BinaryTree<T> t, Node<T> u, Node<T> v) {
        if (u.parent == null) {
            t.root = v;
        } else if(u == u.parent.left) {
            u.parent.left = v;
        } else {
            u.parent.right = v;
        }
        if (v != null) {
            v.parent = u.parent;
        }
    }

    public void delete(BinaryTree<T> t, Node<T> z) {
        Node<T> y = null;
        if (z.left == null) {
            transplant(t, z, z.right);
        } else if(z.right == null) {
            transplant(t, z, z.left);
        } else {
            y = min(z.right);
            if (y.parent != z) {
                transplant(t, y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transplant(t, z, y);
            y.left = z.left;
            y.left.parent = y;
        }
    }


}
