package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("==Animal==");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        // Bird
        System.out.println("\n==Bird==");
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();

        // Mammal
        System.out.println("\n==Mammal==");
        Mammal mammal = new Mammal();
        mammal.eat();
        mammal.sleep();
        mammal.run();

        // Artiodactyl
        System.out.println("\n==Artiodactyl==");
        Artiodactyl artiodactyl = new Artiodactyl();
        artiodactyl.eat();
        artiodactyl.sleep();
        artiodactyl.run();
    }
}
