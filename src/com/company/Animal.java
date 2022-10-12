package com.company;

public class Animal implements AnimalsInterface {
    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats...");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " sleeps...");
    }
}
