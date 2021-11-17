package lesson4;

import java.util.*;

public class ArrayListLearning {
    public static void main(String[] args) {
        //Declaration
        ArrayList myArrListWithoutValues = new ArrayList();
        ArrayList<Integer> myArrListWithDataType = new ArrayList<>();
        ArrayList myArrListWithValues = new ArrayList(Arrays.asList("123", 1234, "bmc",1));
        System.out.println(myArrListWithValues);

        //Add values to ArrayList
        ArrayList<Integer> myIntArrayList = new ArrayList<>();
        myIntArrayList.add(12);
        myIntArrayList.add(99);
        myIntArrayList.add(47);
        myIntArrayList.add(48);
        myIntArrayList.add(46);
        myIntArrayList.add(34);
        myIntArrayList.add(21);
        myIntArrayList.add(87);
        myIntArrayList.add(1);
        myIntArrayList.add(9);

        //Get ArrayList value
        System.out.println(myIntArrayList.get(0));

        //Sort ArrayList
        ArrayList<Integer> sortedArrList = myIntArrayList;
        sortedArrList.add(18);
        Collections.sort(sortedArrList);
        System.out.println(sortedArrList);

        //Remove an element by index
        System.out.println(myIntArrayList);
        myIntArrayList.remove(4);
        System.out.println(myIntArrayList);

        //Remove an element by value
        myIntArrayList.remove((Integer) 99);
        System.out.println(myIntArrayList);
        myArrListWithValues.remove(1);
        myArrListWithValues.remove("bmc");
        System.out.println(myArrListWithValues);

        //Remove an Integer value
        myIntArrayList.removeAll(Arrays.asList(1,18));
        System.out.println(myIntArrayList);
        myIntArrayList.remove(myIntArrayList.indexOf(34)); //Cách này rất ngu
        System.out.println(myIntArrayList);
        myIntArrayList.remove((Integer) 48);

        //Remove duplicated value
        ArrayList myOriginalArrList = new ArrayList(Arrays.asList(123,"bmc", 2323, "bmc","pocolo",123));
        ArrayList resultList = new ArrayList();
        for(int s = 0; s < myOriginalArrList.size(); s++){
            if(s==0){
                resultList.add(myOriginalArrList.get(0));
            } else if(!resultList.contains(myOriginalArrList.get(s))){
                resultList.add(myOriginalArrList.get(s));
            }
        }
        System.out.println(resultList);
    }

}
