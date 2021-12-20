package Lesson11.HomeWork11;

import java.security.SecureRandom;

public abstract class Animal {
    public String name;
    private int speed;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed+1);
    }

    protected int getSpeed(){
        return speed;
    };

    protected String getAnimalName(){
        String name = getClass().getSimpleName();
        return name;
    }

    protected abstract boolean isFlyable();
}
