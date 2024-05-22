package org.learning;

public class Program {

    public static void main(String[] args) {
        Animal[] zoo = {new Dog("Pluto"), new Dolphin("Flipper"), new Eagle("Solara"), new Sparrow("Titti")};

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("My name is " + zoo[i].name);
            zoo[i].makeNoise();
            if(zoo[i] instanceof Dog){
                zoo[i].eat("Meat");
            } else if (zoo[i] instanceof Dolphin) {
                zoo[i].eat("Fish");
            } else if (zoo[i] instanceof Eagle) {
                zoo[i].eat("Mouse");
            } else if (zoo[i] instanceof Sparrow) {
                zoo[i].eat("Worm");
            }

            if(zoo[i] instanceof Flyers){
                ((Flyers) zoo[i]).fly();
            } else if (zoo[i] instanceof Swimmers) {
                ((Swimmers) zoo[i]).swim();
            }
            System.out.println("*******************************************************");
        }
    }
}
