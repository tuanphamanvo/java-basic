package lesson2;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int [] myIntArray = {1,2,3,4,5};

        int targetValue = 0;
        for (int index = 0; index < myIntArray.length; index++){
            System.out.println(myIntArray[index]);
            if (myIntArray[index] == targetValue) {
                break;
            }

        }
    }
}
