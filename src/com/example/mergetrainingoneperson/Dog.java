package com.example.mergetrainingoneperson;

import com.example.mergetrainingoneperson.Animal;

public class Dog extends Animal {
    private String bark;
    private String tail;

    public Dog(String name, String bark, String tail) {
        super(name);
        this.bark = bark;
        this.tail = tail;
    }

    public void getBark() {
        this.bark = bark;
    }

    public void getTail() {
        this.tail = tail;
    }

    //TODO checkout master, pull request from test2 and merge into master
}
