package lesson4;

import java.util.*;

public class HomeWorkDay5 {
    public static void main(String[] args) {
        HashMap<Integer, String> attendeeList = listAttendance();
        HashMap<Integer, String> appearList = rollUp();
        HashMap<Integer, String> randomPersonList = appearList;
        System.out.println("Appear today: " + appearList);
        HashMap<Integer, String> absentList = getAbsentList(attendeeList, appearList);
        System.out.println("Absent today: " + absentList);
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.println("In the class today: " + appearList.values());
            System.out.println("Welcome to roll up and pick random attendee app:");
            System.out.println("1. Add attendee to appearList");
            System.out.println("2. Remove attendee from appearList");
            System.out.println("3. Pick randomly a person");
            System.out.println("4. Finish the class");
            int chosenOption = scanner.nextInt();
            switch (chosenOption) {
                case (1):
                    addToAppearList(appearList,absentList, randomPersonList);
                    break;
                case (2):
                    addToAbsentList(appearList, absentList,randomPersonList);
                    break;
                case (3):
                    pickRandomlyAPerson(randomPersonList,appearList);
                    break;
                case (4):
                    System.out.println("Good bye!!!");
                    keepPlaying = false;
                    break;
                default:
                    System.out.println("Wrong option");


            }
        }

        }

    private static String pickRandomlyAPerson(HashMap<Integer, String> randomPersonList, HashMap<Integer, String> appearList) {
        if(randomPersonList.size()==0){
            randomPersonList=appearList;
        }
        List<Integer> listKey = new ArrayList<>(randomPersonList.keySet());
        int randomIndex = new Random().nextInt(listKey.size());
        int randomNumber = listKey.get(randomIndex);
        String name  = randomPersonList.get(randomNumber);
        System.out.println(name+" please!");
        return (name);
    }


    private static HashMap<Integer, String> addToAbsentList(HashMap<Integer, String> appearList, HashMap<Integer, String> absentList, HashMap<Integer, String> randomPersonList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(appearList);
        System.out.println("Above is appearList, enter attendee number to add to absentList then press Enter:");
        int chosenInt = scanner.nextInt();
        absentList.put(chosenInt, appearList.get(chosenInt));
        appearList.remove(chosenInt);
        randomPersonList.remove(chosenInt);

        return (absentList);
    }

    private static HashMap<Integer, String> addToAppearList(HashMap<Integer, String> appearList, HashMap<Integer, String> absentList, HashMap<Integer,String> randomPersonList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(absentList);
        System.out.println("There is absentList, enter attendee number to add to appearList then press Enter:");
        int chosenInt = scanner.nextInt();
        appearList.put(chosenInt, absentList.get(chosenInt));
        absentList.remove(chosenInt);
        randomPersonList.put(chosenInt, absentList.get(chosenInt));
        return (appearList);
    }


    private static HashMap<Integer, String> rollUp() {
        HashMap<Integer, String> appearList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (Integer key : listAttendance().keySet()){

            boolean wrongInput = true;
            while(wrongInput){
                System.out.println("Is " + listAttendance().get(key) + " in the class? (Y/N)");
                String answer = scanner.nextLine();
                if(answer.equals("Y") || answer.equals("y")){
                    appearList.put(key, listAttendance().get(key));
                    wrongInput = false;
                }
                if(answer.equals("N") || answer.equals("n")) {
                    wrongInput = false;
                }
            }
        }
        return (appearList);
    }

    private static HashMap<Integer, String> getAbsentList(HashMap<Integer,String> attendeeList, HashMap<Integer,String> appearList) {
        HashMap<Integer, String> absentList = new HashMap<>();
        for(Integer key : attendeeList.keySet()){
            if(!appearList.containsValue(attendeeList.get(key))){
                absentList.put(key, attendeeList.get(key));
            }
        }
        return (absentList);
    }

    private static HashMap<Integer, String> listAttendance() {
        HashMap<Integer, String> listAtten = new HashMap<>();
        listAtten.put(1,"Tuan Pham-Le");
        listAtten.put(2,"Pham Thuy Bich Uyen");
        listAtten.put(3,"Nguyen Thi Yen");
//        listAtten.put(4,"Dieu Ai Le");
//        listAtten.put(5,"Nhu Le");
//        listAtten.put(6,"Dao Thuy Quyen");
//        listAtten.put(7,"Nguyen Thi Van Anh");
//        listAtten.put(8,"Tran Dang Bao");
//        listAtten.put(9,"Thanh Nguyen");
//        listAtten.put(10,"Mi Nguyen");
//        listAtten.put(11,"Vo Hong Phuong");
//        listAtten.put(12,"Tran Quoc Hoang");
        return (listAtten);
    }
}
