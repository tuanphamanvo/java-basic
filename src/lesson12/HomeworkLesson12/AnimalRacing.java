package lesson12.HomeworkLesson12;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
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
        List<Animal> animalList = Arrays.asList(horse, tiger, dog, eagle, falcon);
        findTheWinner(animalList);
//        System.out.println("The winner is " + winner.getAnimalName() + " with the speed " + winner.getSpeed());
    }

    private static void findTheWinner(List<Animal> animalList) {
        int winnerSpeed = 0;
        String winnerName = "";
        for(Animal animal: animalList){
            if(animal.isFlyAble() && animal.getSpeed()>=winnerSpeed){
                winnerSpeed = animal.getSpeed();
                winnerName = animal.getAnimalName();
            }
        }
        System.out.println("The winner is " + winnerName + " with the race speed "+ winnerSpeed);
    }
}
