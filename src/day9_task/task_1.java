package day9_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task_1 {
    /*
    此任务练习List的迭代方式
     */
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(3);
        list.add(5);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(Object o:list){
            System.out.println(o);
        }
    }
}
