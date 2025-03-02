package collectionframework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> originalName = new HashSet<>(
                List.of("Visal", "Khemrak"));
        Set<String> names = new HashSet<>(
                List.of("Visal", "Khemrak")
        );
        // remove by using element
        //        names.remove("Sokpheak");
        // if two or more set are the same
        if (originalName.containsAll(names)) {
            System.out.println("These set are the same");
        }
        // remove
        names.addAll(originalName);
        System.out.println(names);
        // names.forEach(e-> System.out.println(e));
        // check size
        System.out.println(names.size());
    }
}
