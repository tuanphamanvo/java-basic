package lesson2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkDay2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Start to input your array----");
        System.out.println("How many elements in your array?");
        int numberOfElements = scanner.nextInt();
        float [] exercise01Array = new float[numberOfElements];
        for (int arrayIndex = 0; arrayIndex < exercise01Array.length; arrayIndex++) {
            System.out.println("Input element #" + (arrayIndex+1) + ":");
            exercise01Array[arrayIndex] = scanner.nextFloat();
        }
        for (float i : exercise01Array) {
            System.out.print(i + " ");
        }


        /*Exercise 01
        Given an array from user input
        Return the index of the max/min number from the array
        Note: We ignore the case we have more than one maximum/minimum number
        */
        float maxValue = exercise01Array[0];
        float minValue = exercise01Array[0];
        for (int arrayIndex = 1; arrayIndex < exercise01Array.length; arrayIndex++) {
            if (exercise01Array[arrayIndex] >= maxValue) {
                maxValue = exercise01Array[arrayIndex];
            }
            if (exercise01Array[arrayIndex] <= minValue) {
                minValue = exercise01Array[arrayIndex];
            }

        }
        System.out.println("\nMax value is: "+ maxValue);
        System.out.println("Min value is: "+ minValue);

        /*Exercise 02
        Given an array from user input
        Find out the average value from the array
        Bonus credit: Follow this to round up the number to 2 floating number Link: https://blog.sdetpro.com/blog/simple-way-to-round-double-or-float-value.html*/
        float sumOfArray = 0;
        for(float value: exercise01Array) {
            sumOfArray += value;
        }
        float avgValue = sumOfArray / (exercise01Array.length);
        avgValue = BigDecimal.valueOf(avgValue).setScale(2, RoundingMode.UP).floatValue();
        System.out.println("The average value is: "+ avgValue);


        /*Given this array:
        {9, 3, 6, 4, 1, 9, 8, 2, 3}
        Write a function to sort that array in ascending order (from min -> max)*/
        int [] givenArray = {9,3,6,4,1,9,8,2,3};
        System.out.println("Original array:");
        for(int value: givenArray){
            System.out.print(value + " ");
        }
        for(int currentIndex = 0; currentIndex<givenArray.length; currentIndex++){
            for(int comparedIndex=0; comparedIndex<givenArray.length; comparedIndex++){
                if(givenArray[currentIndex]<givenArray[comparedIndex]){
                    int temp = givenArray[comparedIndex];
                    givenArray[comparedIndex] = givenArray[currentIndex];
                    givenArray[currentIndex] = temp;
                }
            }
        }
        System.out.println("\nSorted array from min to max:");
        for(int value: givenArray){
            System.out.print(value + " ");
        }
    }
}
