package com.company;

public class Mammal extends Animal implements MammalsInterface {
    @Override
    public void run() {
        System.out.println("Mammal runs...");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal sleeps...");
    }

    @Override
    public void eat() {
        System.out.println("Mammal eats...");
    }
}
