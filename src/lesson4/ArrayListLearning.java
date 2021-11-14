package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLearning {
    public static void main(String[] args) {
        //Declaration
//        ArrayList myArrayList = new ArrayList();
        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();
//        ArrayList<Integer> wrongDeclare = Arrays.asList(1,2,3,4,5);
        ArrayList<Integer> myFixedArrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4)); //Khong the them moi, remove. Chi co the update

        //Add
        myIntArrayList.add(1); //Index 0
        myIntArrayList.add(2); //Index 1
        myIntArrayList.add(3); //Index 2

        //Read - Get
        System.out.println(myIntArrayList.get(1)); //get(index)

        //ArrayList size
        System.out.println(myIntArrayList.size());
        for(int s : myIntArrayList) {
            System.out.println(s);
        }

        for(int elementIndex = 0; elementIndex < myIntArrayList.size(); elementIndex++) {
            System.out.println(myIntArrayList.get(elementIndex));
        }

        //Set
        myIntArrayList.set(myIntArrayList.size()-1, 10);
        for(int s : myIntArrayList) {
            System.out.println(s);
        }

        //Delete/remove
        myIntArrayList.remove(myIntArrayList.size()-1);
        for(int s : myIntArrayList) {
            System.out.println(s);
        }
    }
}
