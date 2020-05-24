package com.example.restservice;

public class Greeting {
    private long id;
    private String content;

    public Greeting(long id,String content){
        this.id = id;
        this.content = content;
    }

    public long getid(){
        return this.id;
    }

    public String getcontent(){
        return this.content;
    }
}