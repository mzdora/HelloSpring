package com.mzdora.pojo;

public class student {
    private int id;
    private String name;
    private teacher teacher;

    public student() {
    }

    public student(int id, String name, com.mzdora.pojo.teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.mzdora.pojo.teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(com.mzdora.pojo.teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
