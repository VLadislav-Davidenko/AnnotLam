package com.company.lambda;

public class Maon {

    public static void main(String[] args) {
        calc(new MulCalculator(), 2,7);
        calc((a, b) -> a - b,20,7);
    }

    public static void calc(Operationable op, int a, int b) {
        System.out.println(op.calc(a,b));
    }
}
