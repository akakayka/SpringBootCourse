package com.example.springbootcourse.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("builder")
public class BeaverBuilder implements Beaver {
    @Override
    public void work() {
        System.out.println("Строю плотину");
    }

    @PostConstruct
    public void construct() {
        System.out.println("Бобр-строитель был создан");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Бобр-строитель был уничтожен");
    }
}
