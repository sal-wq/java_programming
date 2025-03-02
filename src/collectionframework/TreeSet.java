package collectionframework;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args){
        Set<Integer> numbers = new java.util.TreeSet<>();
        numbers.add(-200);
        numbers.add(-2);
        numbers.add(100);
        numbers.add(1);
        // remove
        numbers.remove(-200);
        // remove if
        numbers.removeIf(e->e.equals(100));
        System.out.println(numbers);
    }
}
