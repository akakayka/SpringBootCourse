package com.example.springbootcourse.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("builder")
@Slf4j
public class BeaverBuilder implements Beaver {

    @PostConstruct
    public void construct() {
        log.info("Бобр-строитель был создан");
    }

    @PreDestroy
    public void destroy() {
        log.info("Бобр-строитель был уничтожен");
    }
}
