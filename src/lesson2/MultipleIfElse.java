package lesson2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //......Khong ban-----------18--------ULLIMITED-------------55-------------2 chai------------//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Age");
        int inputAge = scanner.nextInt();
        if(inputAge<18) {
            System.out.println("Khong ban");
        } else if(inputAge <= 55)  {                    /* This is better than "&&18 >= inputAge" */
            System.out.println("UNLIMITED");
        } else {
            System.out.println("2 chai");
        }
    }
}
