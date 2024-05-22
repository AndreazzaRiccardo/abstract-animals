package org.learning.bonus;

public class Creator {
    public static Device create(String device) {
        if(device.equals("dvd")){
            return new Dvd();
        } else if(device.equals("play-station")){
            return new PlayStation();
        } else {
            throw new IllegalArgumentException("Device not found");
        }
    }
}
