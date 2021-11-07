package lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] myFirstArray = {1,2,3,4,5};
        int [] myEmptyArray = new int [5];

        //Ready element value
        int myFirstNumber = myFirstArray[0];
        System.out.println(myFirstNumber);

        //Update element value
        myFirstArray[3] = 4;
        System.out.println(myFirstArray[3]);

        //length
        for (int elementIndex = 0; elementIndex < myEmptyArray.length; elementIndex++) {
            System.out.println(myFirstArray[elementIndex]);
        }

        //enhanced for
        for (int elementValue : myFirstArray) {
            System.out.println(elementValue);
        }

        //Even numbers array
        for(int elementIndex = 0; elementIndex < myEmptyArray.length; elementIndex++) {
            myFirstArray[elementIndex] = myFirstArray[elementIndex]*2;
            System.out.println(myFirstArray[elementIndex]);
        }

        // Allow user to input an array
        /*
        * Arr length
        * Declare array | int [] emptyIntArray[length]
        * allow user to input arr element*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array Length");
        int inputArrayLength = scanner.nextInt();

        int [] myUserArray = new int [inputArrayLength];
        for (int index = 0; index < inputArrayLength; index++) {
            System.out.println("Index " + index + ":");
            myUserArray[index] = scanner.nextInt();
        }

        for (int value : myUserArray) {
            System.out.print(value);
        }

    }

}
