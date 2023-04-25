package com.github.javachaos.javadatastructures.datastructures.lists;

import java.util.stream.IntStream;

public class QueueSample implements Runnable {

    @Override
    public void run() {
        Queue<Integer> q = new Queue<>();
        IntStream.range(1,18).forEach(q::offer);
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        q.poll();
        //This needs to be fully tested.
        IntStream.range(18,24).forEach(q::offer);

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
