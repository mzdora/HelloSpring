package com.mzdora.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private int age;
    private List<String> hobbies;
    private Set<String> games;
    private String GirlFriend;
    private Map<String,String> Card;
    private String[] Books;
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", games=" + games +
                ", GirlFriend='" + GirlFriend + '\'' +
                ", Card=" + Card +
                ", Books=" + Arrays.toString(Books) +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getGirlFriend() {
        return GirlFriend;
    }

    public void setGirlFriend(String girlFriend) {
        GirlFriend = girlFriend;
    }

    public Map<String, String> getCard() {
        return Card;
    }

    public void setCard(Map<String, String> card) {
        Card = card;
    }

    public String[] getBooks() {
        return Books;
    }

    public void setBooks(String[] books) {
        Books = books;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
