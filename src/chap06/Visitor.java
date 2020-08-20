package chap06;

import java.util.*;
public class Visitor {
    public static void print(Collection c) {
        Iterator it = c.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Set set = new HashSet();
        set.add("Tom");
        set.add("Mary");
        set.add("Jack");
        print(set);

        List list = new ArrayList();
        list.add("Linda");
        list.add("Mary");
        list.add("Rose");
        print(list);

        Map map = new HashMap();
        map.put("M","男");
        map.put("F","女");
        print(map.entrySet());
    }
}
