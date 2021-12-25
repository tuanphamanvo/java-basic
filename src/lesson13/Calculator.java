package lesson13;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Input int number 2:");
        int num2 = scanner.nextInt();
        try{
            int result = num1/num2;
            System.out.println("Result: " + result);
        } catch (IllegalStateException e){
            System.out.println("Không ổn rồi");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Thank You");
    }
}
