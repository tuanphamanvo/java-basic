package Lesson11.HomeWork11;

public class Falcon extends Animal {
    public Falcon(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    protected boolean isFlyable() {
        return true;
    }
}
