package lesson12.HomeworkLesson12;

public class Horse extends Animal {
    public Horse(int maxSpeed) {
        super(maxSpeed);
        flyAble = new CannotFly();
    }
}
