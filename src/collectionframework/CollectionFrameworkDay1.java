package collectionframework;

import java.util.ArrayList;

public class CollectionFrameworkDay1 {
    public static void main(String[] args){
        //ArrayList<String> stringsArrayList = new ArrayList<>(List.of("Visal","Roth","Khemrak","Pong","Chhieng"));
        //stringsArrayList.add("Visal");
        //stringsArrayList.add("Khemrak");
        //Collections.sort(stringsArrayList);
        //System.out.println(stringsArrayList);

        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(4);
        Numbers.add(7);
        // adding new element to arrayList by specified index
        Numbers.add(1,100);
        // update element in array list using index
        Numbers.remove(0);
        // remove element from arrayList using index
        Numbers.set(0,200);
        System.out.println(Numbers);
    }
}
