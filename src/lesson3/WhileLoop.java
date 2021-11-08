package lesson3;

public class WhileLoop {
    public static void main(String[] args) {

        //Example while with assigned variable
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
            if(count==7) {
                break;
            }
        }

    for(;;) {
        System.out.println("A");
    }

        //Can use For loop instead
//        for (;count<10;) {
//            System.out.println(count);
//            count++;
//        }

        //Example with call other - Ex: warning when temp >36 degree
//        int trigger = checkTemp();
//        while (trigger > 36) {
//            System.out.println("Hot Temp, Warning!!!");
//            trigger = checkTempl();
        }
}
