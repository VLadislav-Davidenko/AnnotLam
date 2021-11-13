package com.company.lambda;

public class MulCalculator implements Operationable{
    @Override
    public int calc(int a, int b) {
        return a*b;
    }

}
