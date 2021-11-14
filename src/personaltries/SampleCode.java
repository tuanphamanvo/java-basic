package personaltries;

import java.util.Scanner;

public class SampleCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age to see the discount for you:");
        int age = scanner.nextInt();
        switch(age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 18:
                System.out.println("You are NOT allowed to drink, so there is NO discount for you");
                break;
            case 19:
                System.out.println("Your discount is 10%");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:

        }
    }
}
