package com.rsall.rabbitmq.template.runner;

import com.rsall.rabbitmq.template.config.messaging.QueueConfigHelper;
import com.rsall.rabbitmq.template.core.IMessagePublisher;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class Runner implements CommandLineRunner {

    private IMessagePublisher messagePublisher;
    private final QueueConfigHelper queueConfigHelper;

    @Override
    public void run(String... args) throws Exception {
        messagePublisher.publish("Message To Publish", queueConfigHelper.getExchange(), queueConfigHelper.getTestRoutingKey());
    }


}
