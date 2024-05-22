package org.learning.bonus;

abstract class Device implements CommandDevice {

    @Override
    public void play() {
        System.out.println("I'm a " + deviceName() + " and I'm in play");
    }

    @Override
    public void stop() {
        System.out.println("I'm a " + deviceName() + " and I'm stop");
    }

    abstract String deviceName();
}
