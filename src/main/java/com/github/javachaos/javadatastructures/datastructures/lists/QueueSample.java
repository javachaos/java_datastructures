package com.github.javachaos.javadatastructures.datastructures.lists;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class QueueSample implements Runnable {

    private static final Logger logger = LogManager.getLogger(QueueSample.class);
    @Override
    public void run() {
        Queue<Integer> q = new Queue<>();
        IntStream.range(1,18).forEach(q::offer);
        q.poll();
        //This needs to be fully tested.
        IntStream.range(18,2454).forEach(q::offer);

        while(!q.isEmpty()) {
            logger.debug("Q:> {}",q.poll());
        }
    }
}
