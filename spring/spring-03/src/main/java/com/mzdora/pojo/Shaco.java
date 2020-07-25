package com.mzdora.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shaco {
    @Value("Joker")
    private String name;
    @Autowired
    private Box boxs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Box getBoxs() {
        return boxs;
    }

    public void setBoxs(Box boxs) {
        this.boxs = boxs;
    }

    @Override
    public String toString() {
        return "Shaco{" +
                "name='" + name + '\'' +
                ", boxs=" + boxs +
                '}';
    }
}
