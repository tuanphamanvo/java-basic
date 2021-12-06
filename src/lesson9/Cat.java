package lesson9;


public class Cat extends Animal {
    { String defaultName = "Meow";}
    public Cat(String name) {
        super(name);
    }

    @Override
    protected void speak() {
        System.out.println("Meow meow");
    }
}
