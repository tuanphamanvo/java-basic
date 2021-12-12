package lesson9.HomeWorkDay9_AnimalRace;

import java.security.SecureRandom;

public class Animal {
    protected int maxSpeed;
    protected int speed;

    public Animal(int maxSpeed){
        this.maxSpeed = maxSpeed;
        this.speed = getSpeed();
        int range = this.maxSpeed + 1;
        this.speed = new SecureRandom().nextInt(range);
    }
    protected String getAnimalName(){
        String name = getClass().getSimpleName();
        return name;
    }
    protected int getSpeed(){
        return speed;
    }
}
