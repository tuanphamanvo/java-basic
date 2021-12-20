package Lesson11.HomeWork11;

public class Tiger extends Animal {
    public Tiger(int maxSpeed){
        super(maxSpeed);
    }

    @Override
    protected boolean isFlyable() {
        return false;
    }
}
