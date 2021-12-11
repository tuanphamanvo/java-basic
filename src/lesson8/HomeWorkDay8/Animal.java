package lesson8.HomeWorkDay8;

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Horse horse = new Horse();

        int dogSpeed = dog.getSpeed();
        int tigerSpeed = tiger.getSpeed();
        int horseSpeed = horse.getSpeed();

        if(dogSpeed>=tigerSpeed && dogSpeed>=horseSpeed)
            System.out.printf("The winner is " + dog.getSimpleName() + " with the speed: "  + dogSpeed);
        if (tigerSpeed>=dogSpeed && tigerSpeed>=horseSpeed)
            System.out.printf("The winner is " + tiger.getSimpleName() + " with the speed: "  + tigerSpeed);
        if (horseSpeed>=dogSpeed && horseSpeed>=tigerSpeed)
            System.out.printf("The winner is " + horse.getSimpleName() + " with the speed: "  + horseSpeed);
    }
}
