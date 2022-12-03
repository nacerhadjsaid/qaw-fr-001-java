package collections;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(3);

        System.out.println(list);

        for(int a: list){
            System.out.println(a);
        }

        list.remove(2);

        System.out.println(list);

        list.add(7);

        System.out.println(list);

        List list2 = new ArrayList();
        list2.add(1);
        list2.add(1.3);
        list2.add(' ');
        list2.add("str");
        list2.add(true);

    }

}
