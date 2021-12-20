package Lesson11.HomeWork11;

public class Horse extends Animal {
    public Horse(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    protected boolean isFlyable() {
        return false;
    }
}
