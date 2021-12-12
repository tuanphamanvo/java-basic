package lesson9.HomeWorkDay9_AnimalRace;

public class AnimalRacing {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();

        int dogSpeed = dog.getSpeed();
        int horseSpeed = horse.getSpeed();
        int tigerSpeed = tiger.getSpeed();
        if(dogSpeed>=tigerSpeed && dogSpeed>=horseSpeed)
            System.out.printf("The winner is " + dog.getAnimalName() + " with the speed: "  + dogSpeed);
        if (tigerSpeed>=dogSpeed && tigerSpeed>=horseSpeed)
            System.out.printf("The winner is " + tiger.getAnimalName() + " with the speed: "  + tigerSpeed);
        if (horseSpeed>=dogSpeed && horseSpeed>=tigerSpeed)
            System.out.printf("The winner is " + horse.getAnimalName() + " with the speed: "  + horseSpeed);
    }
}
