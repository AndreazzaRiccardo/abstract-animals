package org.learning.zoo;

public class Sparrow extends Animal implements Flyers{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cip cip");
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void fly() {
        System.out.println("I'm sparrow and I fly");
    }
}
