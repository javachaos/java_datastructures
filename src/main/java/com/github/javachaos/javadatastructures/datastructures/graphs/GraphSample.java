package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.HashSet;

public class GraphSample {

    public void run() {
        Graph<String> graph = new Graph<>(new HashSet<>(), new HashSet<>());

// add vertices to the graph
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");
        graph.vertices().add(a);
        graph.vertices().add(b);
        graph.vertices().add(c);

// add edges to the graph
        Edge<String> ab = new Edge<>(a, b);
        Edge<String> ac = new Edge<>(a, c);
        Edge<String> bc = new Edge<>(b, c);
        graph.edges().add(ab);
        graph.edges().add(ac);
        graph.edges().add(bc);
    }
}
