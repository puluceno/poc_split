package com.poc.kafka;

import java.util.Deque;

public class Kafka implements Broker {

    private final Deque<byte[]> topic;

    public Kafka(Deque<byte[]> topic) {
        this.topic = topic;
    }

    @Override
    public void send(byte[] msg) {
        topic.add(msg);
    }

    @Override
    public byte[] consume() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return topic.removeFirst();
    }
}
