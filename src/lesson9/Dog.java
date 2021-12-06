package lesson9;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    protected void speak() {
        System.out.println("Gau gau " + getName());
    }

    public void swimming(){
        System.out.println("I'm swimming");
    }
}
