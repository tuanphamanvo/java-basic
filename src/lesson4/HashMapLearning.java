package lesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        //Declaration
        HashMap myHashMap = new HashMap();
        HashMap<Integer, String> myHashMapWithType = new HashMap<>();

        //Add key-value
        myHashMap.put(123,"bmc");
        myHashMap.put("bmc",123);
        myHashMap.put("bmc","bmc");
        myHashMap.put(123,1234);
        myHashMap.put(12321,1234321);
        System.out.println(myHashMap);

        //Get value by Object Key
        System.out.println(myHashMap.get(123));

        //Update or Replace value
        myHashMap.replace(123,"Others");
        System.out.println(myHashMap);
        myHashMap.replace(123,"Others", 1234);
        System.out.println(myHashMap);
        myHashMap.replace(123,1234, "Others again");
        System.out.println(myHashMap);

        //Get Object Keyset
        System.out.println(myHashMap.keySet());
        //Get Object Value
        System.out.println(myHashMap.values());

        //Get Key by Value
        for(Object s : myHashMap.keySet()){
            if(myHashMap.get(s).equals(1234321) ){
                System.out.println(s);
            }
        }

        //Remove duplicated values
        HashMap originalHashMap = new HashMap();
        originalHashMap.put("hcm", "Ho Chi Minh");
        originalHashMap.put(1,"Quan 1");
        originalHashMap.put(2,"Quan 1");
        HashMap resultHashMap = new HashMap();
        for(Object s : originalHashMap.keySet()){
            if(resultHashMap.size()==0){
                resultHashMap.put(s, originalHashMap.get(s));
            } else if(!resultHashMap.values().contains(originalHashMap.get(s))){
                resultHashMap.put(s, originalHashMap.get(s));
            }
        }
        System.out.println(resultHashMap);

    }
}