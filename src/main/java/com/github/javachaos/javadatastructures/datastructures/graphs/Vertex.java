package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

    private T datum;

    private final List<T> neighbors;

    protected Vertex(T datum, List<T> neighbors) {
        this.datum = datum;
        this.neighbors = neighbors;
    }

    public Vertex(T datum) {
        this(datum, new LinkedList<>());
    }

    public List<T> getNeighbors() {
        return neighbors;
    }

    public T getData() {
        return datum;
    }

    public void setData(T data) {
        this.datum = data;
    }
}
