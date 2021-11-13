package com.company.anonim;

public class AnonimTest {

    public static void main(String[] args) {
        TestClass testClass = new TestClass("rrrrrr");
        testClass.method("gtgtgtgtg");

        TestClass testClass2 = new TestClass("rrrrrr"){
            @Override
            public void method(String s) {
                System.out.println("++++++++++ " + s);
            }
        };
        testClass2.method("fsdfsdfsdf");

        AbstrTestClass abstrTestClass = new AbstrTestClass("aaaaa"){
            @Override
            public void method(String s) {
                System.out.println("from abstract " + s);
            }
        };
        abstrTestClass.method("Hello Abstract");

        TestInterface testInterface = new TestInterface() {
            @Override
            public void print(int i) {
                System.out.println("From interface " + i);
            }
        };
        testInterface.print(777);
    }
}
