package lesson12.HomeworkLesson12;

public class Eagle extends Animal implements FlyAbility{
    public Eagle(int maxSpeed) {
        super(maxSpeed);
        flyAbility = new CanFly();
    }

    @Override
    public boolean flyAble() {
        return true;
    }
}
