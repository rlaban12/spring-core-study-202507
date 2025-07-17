package com.spring.core.chap02_2.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Engine {


    public void start() {
        System.out.println("엔진 시동 걸렸습니다.");
    }
}
