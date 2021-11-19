package personaltries;

import java.util.*;

public class issue {
    public static void main(String[] args) {
        HashMap<Integer, String> appearList = new HashMap<>();
        appearList.put(1,"a");
        appearList.put(2,"b");
        HashMap<Integer, String> randomPersonList= new HashMap<>(appearList);
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.println("1. Pick randomly a person");
            int chosenOption = scanner.nextInt();
            if (chosenOption == 1) {
                pickRandomlyAPerson(randomPersonList, appearList);
            } else {
                System.out.println("Wrong option");
            }
        }

    }
    private static String pickRandomlyAPerson(HashMap<Integer, String> randomPersonList, HashMap<Integer, String> appearList) {
        if(randomPersonList.size()==0){
           randomPersonList= new HashMap<>(appearList);
        }
        List<Integer> listKey = new ArrayList<>(randomPersonList.keySet());
        int randomIndex = new Random().nextInt(listKey.size());
        int randomNumber = listKey.get(randomIndex);
        String name  = randomPersonList.get(randomNumber);
        randomPersonList.remove(randomNumber);
        System.out.println(name+" please!");
        System.out.println(randomPersonList);
        return (name);
    }
}

