package com.slz.rocketmq.delayMsg.service;

import org.springframework.scheduling.annotation.Async;

public interface UserService {

    @Async
    void asyncHello(String name);
}
