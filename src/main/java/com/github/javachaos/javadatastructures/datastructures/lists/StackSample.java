package com.github.javachaos.javadatastructures.datastructures.lists;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class StackSample implements Runnable {
    private static final Logger logger = LogManager.getLogger(StackSample.class);
    private static final Random rand = new Random();

    public void run() {
        Stack<Integer> s = new Stack<>();
        int n = 10000;
        while(n > 0) {
            s.push(rand.nextInt(1000));
            n--;
        }
        s.push(4);
        s.push(3);

        while(!s.isEmpty()) {
            logger.debug("S:> {}", s.pop());
        }
    }
}
