package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.Set;

public class Graph<T> {
    private final Set<Vertex<T>> vertices;
    private final Set<Edge<T>> edges;

    public Graph(Set<Vertex<T>> vertices, Set<Edge<T>> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public Set<Vertex<T>> getVertices() {
        return vertices;
    }

    public Set<Edge<T>> getEdges() {
        return edges;
    }
}
