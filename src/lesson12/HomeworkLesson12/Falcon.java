package lesson12.HomeworkLesson12;

public class Falcon extends Animal{
    public Falcon(int maxSpeed) {
        super(maxSpeed);
        flyAble = new CanFly();
    }
}
