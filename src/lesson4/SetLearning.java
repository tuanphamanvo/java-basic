package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetLearning {
    public static void main(String[] args) {
        //Declaration
        Set<Integer> mySet = new HashSet<>(Arrays.asList(1,1,3,5,7,9,9));
        mySet.add(123);
        System.out.println(mySet); //[1, 3, 5, 7, 9, 123]


        ArrayList myArrList = new ArrayList(Arrays.asList(1,2,"3",4,1,2,3,4,5));
        Set resultSet = new HashSet();
        for(int key = 0; key < myArrList.size(); key++){
            resultSet.add(myArrList.get(key));
        }
        System.out.println(resultSet);
    }
}
