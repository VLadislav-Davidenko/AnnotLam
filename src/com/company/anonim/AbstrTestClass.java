package com.company.anonim;

public abstract class AbstrTestClass {

    private String test;

    public AbstrTestClass(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public abstract void method(String s);
}
