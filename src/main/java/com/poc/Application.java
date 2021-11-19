package com.poc;

import com.poc.kafka.Broker;
import com.poc.kafka.Kafka;

import java.util.ArrayDeque;

public class Application {

    private static final int MAX_SIZE = 8;

    public static void main(String[] args) {
        final Broker kafka = new Kafka(new ArrayDeque<>());
        final Producer producer = new Producer(kafka, MAX_SIZE);
        final Consumer consumer = new Consumer(kafka);


    }
}
