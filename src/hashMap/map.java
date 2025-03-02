package hashMap;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> mapp = new HashMap<>();
        // add element to map
        mapp.put(1,"Apple");
        mapp.put(1,"Banana");
        mapp.put(2,"Water");
        mapp.put(3,"Drink");
        mapp.put(4, null);
        // mapp.put(null, null);
        //
        for(Map.Entry<Integer, String> obj: mapp.entrySet()) {
            //System.out.println("Key: " + obj.getKey());
            //System.out.println("Value: " + obj.getValue());
            System.out.println(obj);
        }
        // remove element in map by using key of map
        mapp.remove(4);
        //
        String getElementUsingKey = mapp.get(3);
        System.out.println("All element after removed: ");
        for(Map.Entry<Integer, String> obj: mapp.entrySet()){
            System.out.println(obj);
        }




        //Set<Integer> keys = mapp.keySet();
        //System.out.println("All keys: " + keys);
        //Collection<String> values = mapp.values();
        //System.out.println("All values in map: " + values);
        //System.out.println(mapp);
    }
}
