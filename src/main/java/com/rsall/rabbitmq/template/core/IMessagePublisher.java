package com.rsall.rabbitmq.template.core;

public interface IMessagePublisher {
    void publish(Object payload, String exchange, String routingKey);
}
