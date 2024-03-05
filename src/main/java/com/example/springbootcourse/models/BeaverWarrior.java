package com.example.springbootcourse.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("warrior")
public class BeaverWarrior implements Beaver {

    @Override
    public void work() {
        System.out.println("Защищаю плотину");
    }

    @PostConstruct
    public void construct() {
        System.out.println("Бобр-воин был создан");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Бобр-воин был уничтожен");
    }
}
