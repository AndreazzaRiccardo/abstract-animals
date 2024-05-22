package org.learning.zoo;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("Zzzzz");
    }

    public abstract void makeNoise();

    public abstract void eat(String food);
}
