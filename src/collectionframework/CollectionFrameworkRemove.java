package collectionframework;

import java.util.ArrayList;

public class CollectionFrameworkRemove {
    public static void main(String[] args){
        ArrayList<Integer> integerArrayList
                = new ArrayList<>();
        integerArrayList.add(4);
        integerArrayList.add(7);
        // adding new element to arrayList by specified index
        integerArrayList.add(1,100);
        // remove element from arrayList using index
        integerArrayList.remove(0);
//        integerArrayList.removeLast();
//        integerArrayList.removeFirst();
        // update element in array list using index
        integerArrayList.set(0,200);
        // get element of arraylist
        System.out.println(integerArrayList.getFirst());
        System.out.println(integerArrayList.getLast());
        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.get(1));
        // loop through arraylist element
        integerArrayList.forEach(e-> System.out.println(e));

    }
}
