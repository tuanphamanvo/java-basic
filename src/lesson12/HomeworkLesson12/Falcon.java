package lesson12.HomeworkLesson12;

public class Falcon extends Animal implements FlyAbility{
    public Falcon(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public boolean flyAble() {
        return true;
    }
}
