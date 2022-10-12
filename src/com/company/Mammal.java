package com.company;

public class Mammal extends Animal implements MammalsInterface {
    @Override
    public void run() {
        System.out.println(getClass().getSimpleName() + " runs...");
    }
}
