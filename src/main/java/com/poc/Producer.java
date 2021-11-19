package com.poc;

import com.poc.kafka.Broker;

import java.nio.charset.StandardCharsets;

public class Producer {

    private final Broker kafka;
    private final int maxSize;

    public Producer(Broker kafka, int maxSize) {
        this.kafka = kafka;
        this.maxSize = maxSize;
    }

    public void produce(byte[] msg) {
        kafka.send(msg);
    }

    public byte[] prepareMsg(String msg) {
        final byte[] utf8Bytes = msg.getBytes(StandardCharsets.UTF_8);
        int size = utf8Bytes.length;

        System.out.println("Limit: " + getMaxSize() + " bytes");
        System.out.println("Message has: " + size + " bytes");

        if (size > getMaxSize()) {

        }
    }

    public Broker getKafka() {
        return kafka;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
