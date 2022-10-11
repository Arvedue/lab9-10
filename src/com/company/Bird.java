package com.company;

public class Bird extends Animal implements BirdsInterface {
    @Override
    public void fly() {
        System.out.println("Bird flies...");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats...");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeps...");
    }
}
