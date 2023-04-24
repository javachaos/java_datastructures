package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.Set;

public record Graph<T>(Set<Vertex<T>> vertices, Set<Edge<T>> edges) {}
