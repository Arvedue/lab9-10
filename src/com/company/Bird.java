package com.company;

public class Bird extends Animal implements BirdsInterface {
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flies...");
    }

}
