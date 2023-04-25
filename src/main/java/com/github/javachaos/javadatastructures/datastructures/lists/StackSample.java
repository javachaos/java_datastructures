package com.github.javachaos.javadatastructures.datastructures.lists;

public class StackSample implements Runnable {
    public void run() {
        Stack<Integer> s = new Stack<>();
        int n = 10000;
        while(n > 0) {
            s.push((int)(10000 * Math.random()));
            n--;
        }
        s.push(4);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
