package lesson8.HomeWorkDay8;

import java.security.SecureRandom;

public class Horse {
    private int speed;
    public Horse(){
    }
    public String getSimpleName(){
        String name = getClass().getSimpleName();
        return name;
    }
    public int getSpeed(){
        this.speed = new SecureRandom().nextInt(75+1);
        return this.speed;
    }
}
