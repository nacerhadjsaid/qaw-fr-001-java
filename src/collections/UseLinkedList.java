package collections;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("jack");
        list.add("brad");
        list.add("david");
        list.add("boualem");
        list.add("ali");

        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
