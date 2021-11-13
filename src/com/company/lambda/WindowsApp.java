package com.company.lambda;

public class WindowsApp {

    public static void main(String[] args) {

        String name = "New";

        btnProcessor(() -> {
            System.out.println("Hello world! ");
            System.out.println("Name = " + name);
            return "page/workspace";
        }, () -> "nowhere", () -> {
            System.out.println("Boom");
            return "file:repoert";
        }

        );

    }

    public static void btnProcessor(Button ...btns){
        for (Button btn : btns) {
            String path = btn.onClick();
            System.out.println("Go to " + path);
        }

    }
}
