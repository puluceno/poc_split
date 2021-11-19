package com.poc.kafka;

public interface Broker {
    void send(byte[] msg);

    byte[] consume();
}
