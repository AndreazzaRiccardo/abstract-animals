package org.learning.zoo;

public class Eagle extends Animal implements Flyers{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Screeee");
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void fly() {
        System.out.println("I'm eagle and I fly");
    }
}
