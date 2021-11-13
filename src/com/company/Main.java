package com.company;

public class Main {

    public static void main(String[] args) {
        Test test = new Test("Oleg");
        Service ser1 = new Service(1234);

        Class<? extends Test> testClass = test.getClass();
        Class<? extends Service> serviceClass = ser1.getClass();

        About testannotation = testClass.getAnnotation(About.class);
        About serviceannotation = serviceClass.getAnnotation(About.class);

        System.out.println("Test: " + testannotation.info());
        System.out.println("Service: " + serviceannotation.info());
    }
}
