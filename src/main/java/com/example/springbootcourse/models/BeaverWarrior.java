package com.example.springbootcourse.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("warrior")
@Slf4j
public class BeaverWarrior implements Beaver {

    @PostConstruct
    public void construct() {
        log.info("Бобр-воин был создан");
    }

    @PreDestroy
    public void destroy() {
        log.info("Бобр-воин был уничтожен");
    }
}
