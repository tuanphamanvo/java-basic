package lesson8.HomeWorkDay8;

import java.security.SecureRandom;

public class Tiger {
    private int speed;
    public Tiger(){
    }
    public String getSimpleName(){
        String name = getClass().getSimpleName();
        return name;
    }
    public int getSpeed(){
        this.speed = new SecureRandom().nextInt(100+1);
        return this.speed;
    }
}
