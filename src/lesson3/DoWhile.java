package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhile {
    /*
    *
    * */
    public static void main(String[] args) {

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
                System.out.println("Correct!!!" + enteredNumber);
                break;
            }
            tryTime++;

        } while (tryTime < MAX_TRY_TIME);
        System.out.println("Correct answer is: " + randomNumber);
        System.out.println("See you next time");

    }
}
