package com.example.springbootcourse.services;

import com.example.springbootcourse.models.Beaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class BeaverService {

    private Beaver setterBuilder;
    private Beaver setterWarrior;

    private final Beaver constructBuilder;
    private final Beaver constructWarrior;

    @Autowired
    @Qualifier("builder")
    private Beaver annotationBuilder;

    @Autowired
    @Qualifier("warrior")
    private Beaver annotationWarrior;

    @Autowired
    public BeaverService(@Qualifier("builder") Beaver builder, @Qualifier("warrior") Beaver warrior)
    {
        this.constructBuilder = builder;
        this.constructWarrior = warrior;
    }

    @Autowired
    public void setBuilder(@Qualifier("builder") Beaver builder)
    {
        this.setterBuilder = builder;
    }

    @Autowired
    public void setWarrior(@Qualifier("warrior") Beaver warrior)
    {
        this.setterWarrior = warrior;
    }
}
