package org.learning.bonus;

public class Main {

    public static void main(String[] args) {
        Device dvd = Creator.create("dvd");
        dvd.play();
        dvd.stop();

        Device playStation = Creator.create("play-station");
        playStation.play();
        playStation.stop();
    }
}
