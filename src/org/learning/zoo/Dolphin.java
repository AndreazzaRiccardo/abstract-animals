package org.learning.zoo;

public class Dolphin extends Animal implements Swimmers{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Squee squee");
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void swim() {
        System.out.println("I'm dolphin and I swim");
    }
}
