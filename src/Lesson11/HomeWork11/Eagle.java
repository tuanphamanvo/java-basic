package Lesson11.HomeWork11;

public class Eagle extends Animal {
    public Eagle(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    protected boolean isFlyable() {
        return true;
    }
}
