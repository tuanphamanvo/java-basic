package lesson12.lesson12_1;

public class DecoDuck extends Duck{
    public DecoDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public static void main(String[] args) {
        Duck decoDuck = new DecoDuck();
        decoDuck.performQuack();
        decoDuck.performFly();
    }
}
