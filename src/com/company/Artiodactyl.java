package com.company;

public class Artiodactyl extends Mammal {
    @Override
    public void eat() {
        System.out.println("Even-toed ungulate eats...");
    }

    @Override
    public void sleep() {
        System.out.println("Even-toed ungulate sleeps...");
    }

    @Override
    public void run() {
        System.out.println("Even-toed ungulate runs...");
    }
}
