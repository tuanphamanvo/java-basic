package lesson9;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("name");
        cat.speak();
        cat.printDefaultName();
        Animal cat2 = new Cat("name");
        cat2.speak();

        Dog dog = new Dog("Kiki");
        Animal dog2 = new Dog("Lulu");
        dog2.speak();
        dog.speak();
        System.out.println(cat instanceof Cat);
        dog.swimming();

    }

}
