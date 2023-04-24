package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

    private T data;
    private final LinkedList<T> neighbors;

    public Vertex(T data) {
        this.data = data;
        this.neighbors = new LinkedList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void addNeighbor(T neighbor) {
        neighbors.add(neighbor);
    }

    public List<T> getNeighbors() {
        return neighbors;
    }
}
