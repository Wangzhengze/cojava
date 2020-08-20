package day9_task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class task_4 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "阿牛哥");
        map.put(4, "灭绝师太");
        //方式1
        Set s=map.entrySet();
        for(Object o:s){
            System.out.println(o);
        }
//        System.out.println(s);
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"赵敏");
//        System.out.println(map);

        //方法2 拿key
        for(Integer i:map.keySet()){
            System.out.println(i+"   "+map.get(i));
        }
        //方法3 只获取值


    }
}
