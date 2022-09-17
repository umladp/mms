package com.example.rocketmqbroadcastproducer;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RocketmqBroadcastProducerApplicationTests {
    @Autowired
    OrderService orderService;

    @Test
    public void contextLoads11() throws Exception {
        orderService.makeOrder();
    }

}
