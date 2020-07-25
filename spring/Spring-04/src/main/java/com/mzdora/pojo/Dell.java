package com.mzdora.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dell {
    @Value("戴尔")
    private String name;
    @Autowired
    private Latitude laptop;

    public Dell() {
    }

    public Dell(String name, Latitude laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Latitude getLaptop() {
        return laptop;
    }

    public void setLaptop(Latitude laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "name='" + name + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
