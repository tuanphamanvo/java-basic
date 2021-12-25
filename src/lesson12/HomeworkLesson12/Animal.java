package lesson12.HomeworkLesson12;


import java.security.SecureRandom;

public abstract class Animal {
    FlyAbility flyAbility;

    public String name;
    private int speed;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed+1);
    }

    public Animal() {
    }

    protected int getSpeed(){
        return speed;
    };

    protected String getAnimalName(){
        String name = getClass().getSimpleName();
        return name;
    }

}
