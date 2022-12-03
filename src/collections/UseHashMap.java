package collections;

import java.util.*;

public class UseHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "NY");
        map.put(2, "CA");
        map.put(3, "CH");
        map.put(4, "MI");
        map.put(5, "NA");

        System.out.println(map);
        System.out.println(map.get(2));

        for (Map.Entry entry: map.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }

        List<String> algeria = new ArrayList<>();
        algeria.add("TI");
        algeria.add("BE");
        algeria.add("BO");
        algeria.add("AL");
        algeria.add("GH");

        List<String> usa = new ArrayList<>();
        usa.add("NY");
        usa.add("CA");
        usa.add("CH");
        usa.add("MI");
        usa.add("NA");

        Map<Integer, List<String>> map1 = new HashMap<>();
        map1.put(1, algeria);
        map1.put(2, usa);

        System.out.println(map1);

    }
}
