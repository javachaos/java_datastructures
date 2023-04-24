package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.LinkedList;

public record Vertex<T>(T datum, LinkedList<T> neighbors) {
    public Vertex(T datum) {
        this(datum, new LinkedList<>());
    }
}
