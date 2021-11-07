package lesson1;

import java.sql.SQLOutput;

public class VariableLearning {
    public static void main(String[] args) {
//        int myIntValue = 1;
//        System.out.println("Hello World");
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(myIntValue);
        int value1 = 1;
        int value2 = 2;
        float myFload = 0.23f;
        boolean isValue1LessThanValue2 = value1 != value2;
        System.out.println(isValue1LessThanValue2);
        System.out.printf(value1 + " " + value2 + " " + isValue1LessThanValue2);
//        System.out.printf("Value 1: %d Value 2: %d\n myFload: %f", value1, value1, myFload);
        System.out.printf("Number 1 is: %d and my number2 is %d\n", value1, value2);
        System.out.printf("\t sasdasd %f", myFload);



        int a = 3;
        int b = 5;
        int c = ++a + b++;
        System.out.println(c);
        /* b++ is post fix - do it after the line
        Flow:
        a = 3
        b = 5
        c = (++a = 4) + 5 = 9
        b = 6
        => a = 4, c = 9, b = 6
        * */




        int e = 7/3;
        int d = 7%3;
    }
}
