package com.company;


public class Calculator {

    public double calculate(int item1, int item2, char op) {
        switch (op){
            case '/': return (double) item1 / item2;
            case '*': return (double) item1 * item2;
            case '+': return plus(item1,item2);
            case '-': return minus(item1,item2);
        }
        return  55.0;
    }

    private double minus(int item1, int item2) {
        return (double) item1 - item2;
    }

    private double plus(int item1, int item2) {
        return (double) item1 + item2;
    }

}