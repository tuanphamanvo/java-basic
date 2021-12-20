package Lesson11.HomeWork11;

import java.util.Arrays;
import java.util.List;

public class TestAnimal {
    public static Animal animalRacing(List<Animal> animalList) {
        Animal winner = null;
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                if (winner == null) {
                    winner = animal;
                } else {
                    if (animal.getSpeed() > winner.getSpeed()) {
                        winner = animal;
                    }
                }
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        final int HORSE_MAX_SPEED = 75;
        final int TIGER_MAX_SPEED = 100;
        final int EAGLE_MAX_SPEED = 60;
        final int DOG_MAX_SPEED = 60;
        final int FALCON_MAX_SPEED = 40;

        Animal horse = new Horse(HORSE_MAX_SPEED);
        Animal tiger = new Tiger(TIGER_MAX_SPEED);
        Animal eagle = new Eagle(EAGLE_MAX_SPEED);
        Animal dog = new Dog(DOG_MAX_SPEED);
        Animal falcon = new Falcon(FALCON_MAX_SPEED);
        List<Animal> animalList = Arrays.asList(horse,tiger,eagle, falcon, dog);
        Animal winner = animalRacing(animalList);
        System.out.println("The winner is "+ winner.getAnimalName() + " with the speed " + winner.getSpeed());
    }
}
