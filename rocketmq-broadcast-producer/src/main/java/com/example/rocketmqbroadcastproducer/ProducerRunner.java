//package com.example.rocketmqbroadcastproducer;
//
//import org.apache.rocketmq.common.message.MessageConst;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.MessageHeaders;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//@Component
//public class ProducerRunner implements CommandLineRunner {
//    @Autowired
//    private MessageChannel output;
//    @Override
//    public void run(String... args) throws Exception {
//        Map<String, Object> headers = new HashMap<>();
//        headers.put(MessageConst.PROPERTY_TAGS, "tagStr");
//        Message message = MessageBuilder.createMessage("hello world, blue sea", new MessageHeaders(headers));
//        output.send(message);
//    }
//}
//
