package personaltries;

import java.util.*;

public class SampleCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input true/false:");
        String input = scanner.nextLine();
        switch (input){
            case "true":
                System.out.println("It's TRUE");
            case "false":
                System.out.println("It's FALSE");
            default:
                throw new IllegalArgumentException(input + " is NOT supported");
        }
    }

}
