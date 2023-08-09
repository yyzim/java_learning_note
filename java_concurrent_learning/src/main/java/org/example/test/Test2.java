package org.example.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test2")
public class Test2 {
    public static void main(String[] args) {
        Runnable runnable = () -> log.debug("running");
        Thread t2 = new Thread(runnable, "t2");
        Thread t1 = new Thread(runnable, "t1");
        t1.start();
        t2.start();
    }
}
