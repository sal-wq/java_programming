package collectionframework;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFrameworkDay2 {
    public static void main(String[] args){
        Set<String> names = new TreeSet<>();
        // add element to set
        names.add("Visal".toLowerCase(Locale.ROOT));
        names.add("Thirath");
        names.add("Khemrak");
        // get element from set
        for(String name: names){
            if(name.equals("VISAL".toLowerCase())){
                System.out.println(name + " existed");
            }
        }
        // remove
        names.remove("Visal");
        //
    }
}
