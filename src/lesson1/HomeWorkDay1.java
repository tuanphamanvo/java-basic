package lesson1;

import java.util.Calendar;

public class HomeWorkDay1 {
    public static void main(String[] args) {
        int yearOfBirth = 1991;
        String name = "Tuan Pham-Le";
        float mathAvg = 5.5F;
        float literatureAvg = 4.9F;
        float subjectAvg = (mathAvg + literatureAvg)/2;
        boolean passed = subjectAvg > 5;
        int yearOld = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
        System.out.printf("Hi %S, your age: %d \n", name, yearOld);
        if(passed){
            System.out.printf("Your GPA is: %.2f. Your are passed this semester.", subjectAvg);
        } else {
            System.out.printf("Your GPA is: %.2f. Your are failed this semester.", subjectAvg);
        }
    }
}
