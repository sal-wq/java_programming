package collectionframework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLesson {
    public static void main(String [] args){
        Set<String> stringSet = new HashSet<>(List.of("Somnang"));
        // add
        stringSet.add("Sal");
        stringSet.add("Roth");
        stringSet.add("Pong");
        // remove by index
        stringSet.remove("Somnang");
        // clear all element inside set
        stringSet.clear();
        // check if the element exist in the set
        stringSet.contains("Somnang");
        System.out.println(stringSet);
    }
}
