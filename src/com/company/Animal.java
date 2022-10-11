package com.company;

public class Animal implements AnimalsInterface {
    @Override
    public void eat() {
        System.out.println("Animal eats...");
    }

    @Override
    public void sleep() {
        System.out.println("Animal sleeps...");
    }
}
