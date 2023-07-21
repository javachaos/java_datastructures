package com.github.javachaos.javadatastructures.datastructures.graphs;

import java.util.HashSet;

public class GraphSample {

    public void run() {
        Graph<String> graph = new Graph<>(new HashSet<>(), new HashSet<>());

// add vertices to the graph
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");
        graph.getVertices().add(a);
        graph.getVertices().add(b);
        graph.getVertices().add(c);

// add edges to the graph
        Edge<String> ab = new Edge<>(a, b);
        Edge<String> ac = new Edge<>(a, c);
        Edge<String> bc = new Edge<>(b, c);
        graph.getEdges().add(ab);
        graph.getEdges().add(ac);
        graph.getEdges().add(bc);

    }
}
