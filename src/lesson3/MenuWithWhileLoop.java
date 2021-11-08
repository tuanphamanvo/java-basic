package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class MenuWithWhileLoop {
    public static void main(String[] args) {
        /* Menu
        * 1. Check Even Number
        * 2. Guessing Number
        * 3. Greeting By Name
        * */
        boolean keepPlaying = true;
        int failedAttemp = 0;

///Homework: Switch while(keepPlaying) to do while/switch case
        while(keepPlaying) {
            if(failedAttemp == 3) {
                System.out.println("Exceed max try");
                break;
            }
            System.out.println("=================Choose an option===================");
            System.out.println("1. Check Even Number");
            System.out.println("2. Guessing Number");
            System.out.println("3. Greeting By Name");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your choice:");
            int chosenOption = scanner.nextInt();
            switch (chosenOption) {
                case(1):
                    checkEvenNumber();
                    break;
                case(2):
                    guessingNumber();
                    break;
                case(3):
                    greetingName();
                    break;
                case(0):
                    System.out.println("Good bye!!!");
                    keepPlaying = false;
                    break;
                default:
                    System.out.println("Wrong option");
                    failedAttemp++;



            }

//            if(chosenOption == 1) {
//                checkEvenNumber();
//            }
//            else if(chosenOption == 2) {
//                guessingNumber();
//            } else if(chosenOption == 3) {
//                System.out.println("Enter your name: ");
//                String enteredName = scanner.toString();
//                System.out.println("Hello " + enteredName);
//            } else if(chosenOption == 0) {
//                System.out.println("Good bye!!!");
//                keepPlaying = false;
//            }
//            else {
//
//
//            }
        }
    }

    private static void greetingName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String enteredName = scanner.toString();
        System.out.println("Hello " + enteredName);
    }

    private static void guessingNumber() {
        int tryTime = 0;
        final int MAX_TRY_TIME = 5; //Const, cannot re-declare
        int [] myArray = {0,1,2,3,4,5,6,7};
        int randomIndex = new SecureRandom().nextInt(myArray.length); //Exclusive
        int randomNumber = myArray[randomIndex];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your guessing number");
            int enteredNumber = scanner.nextInt();
            if(enteredNumber == randomNumber) {
                System.out.println("Correct!!!");
                break;
            }
            tryTime++;

        } while (tryTime < MAX_TRY_TIME);
        System.out.println("Correct answer is: " + randomNumber);
        System.out.println("See you next time");
    }

    private static void checkEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int enteredNumberForCheckingEven = scanner.nextInt();
        if(enteredNumberForCheckingEven%2 != 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }

}
