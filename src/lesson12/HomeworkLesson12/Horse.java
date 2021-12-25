package lesson12.HomeworkLesson12;

public class Horse extends Animal {
    public Horse(int maxSpeed) {
        super(maxSpeed);
        flyAbility = new CannotFly();
    }

    public boolean flyAble() {
        return false;
    }
}
