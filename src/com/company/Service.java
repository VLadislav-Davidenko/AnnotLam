package com.company;

@About(info = "This is the Service class")
public class Service {

    private int value;

    public Service(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
