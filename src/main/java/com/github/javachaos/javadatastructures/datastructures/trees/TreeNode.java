package com.github.javachaos.javadatastructures.datastructures.trees;

public record TreeNode<T>(T data, TreeNode<T> parent, TreeNode<T> left, TreeNode<T> right) {}
