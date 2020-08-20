package day9_task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task_2 {
    public static void main(String[] args) {
        Set set= new HashSet();
        set.add("word");
        set.add(1);
        set.add("ccc");

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Object o:set){
            System.out.println(o);
        }

        set.remove("word");
        System.out.println("删除之后");
        for(Object o:set){
            System.out.println(o);
        }
    }
}
