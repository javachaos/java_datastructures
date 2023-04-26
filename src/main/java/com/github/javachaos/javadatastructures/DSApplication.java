package com.github.javachaos.javadatastructures;

import com.github.javachaos.javadatastructures.datastructures.lists.QueueSample;
import com.github.javachaos.javadatastructures.datastructures.lists.StackSample;

public class DSApplication {

    public static void main(String[] args) {
        QueueSample qs = new QueueSample();
        qs.run();
        StackSample ss = new StackSample();
        ss.run();
    }
}