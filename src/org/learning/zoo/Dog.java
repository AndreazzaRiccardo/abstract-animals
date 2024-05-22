package org.learning;

public class Dog extends Animal implements Swimmers{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    @Override
    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    @Override
    public void swim() {
        System.out.println("I'm dog and I swim");
    }
}
