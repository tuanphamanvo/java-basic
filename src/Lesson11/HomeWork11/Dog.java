package Lesson11.HomeWork11;

public class Dog extends Animal {
    public Dog(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    protected boolean isFlyable() {
        return false;
    }
}
