package com.poc;

import com.poc.kafka.Broker;

public class Consumer {

    private final Broker kafka;

    public Consumer(Broker kafka) {
        this.kafka = kafka;
    }

    public String consume(){
        byte[] msg = kafka.consume();

        return null;
    }
}
