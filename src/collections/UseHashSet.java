package collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class UseHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(3);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(8);
        set.add(3);

        System.out.println(set);

        Set<String> set1 = new HashSet<>();

        set1.add("jack");
        set1.add("brad");
        set1.add("john");
        set1.add("boualem");
        set1.add("jonathan");
        set1.add("ali");

        System.out.println(set1);
    }
}
