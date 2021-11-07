package lesson2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNumber = scanner.nextInt();
        String notification = "";
        if(inputNumber == 3) {
            notification = "You input number 3";
        } else {
            notification = "That is NOT number 3";
        }
        System.out.println(notification);

        /*Ternary Operator*/
        notification = inputNumber == 3 ? "You input number 3" : "That is NOT number 3";
        System.out.println(notification);
    }
}
