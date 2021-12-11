package lesson8.HomeWorkDay8;

import java.security.SecureRandom;

public class Dog {
    private int speed;
    public Dog(){
    }
    public String getSimpleName(){
        String name = getClass().getSimpleName();
        return name;
    }
    public int getSpeed(){
        this.speed = new SecureRandom().nextInt(60+1);
        return this.speed;
    }
}
