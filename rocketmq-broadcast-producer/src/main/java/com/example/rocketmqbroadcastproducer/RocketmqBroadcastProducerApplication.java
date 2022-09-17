package com.example.rocketmqbroadcastproducer;

import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
//@EnableBinding({ Source.class, Sink.class })
public class RocketmqBroadcastProducerApplication   {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqBroadcastProducerApplication.class, args);
    }

    @Bean
    public Supplier<String> output()
    {
        return ()->"hijisnsafda";
    }

    @Bean
    public Consumer<String> input()
    {
         return str -> {
            System.out.println(str);
        };
    }

}
