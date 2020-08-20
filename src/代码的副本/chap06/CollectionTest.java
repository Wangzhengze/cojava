package 代码的副本.chap06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","tom");
        map.put("1","mark");
        map.put("2","jack");
        map.put("3","rose");
        map.put("4","rose");
//        map.put(null,null);
        System.out.println(map.size());
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry:entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("*************");
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        /*
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            Integer next = iter.next();
            System.out.println(next);
        }
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("hello");
        list.add("world");
        list.add("world");
        //list.clear();
        System.out.println(list.contains("tom"));
        System.out.println(list.size());
        System.out.println(list.remove("world"));
        System.out.println("get:"+list.get(1));
        System.out.println(list.isEmpty());
        for(String str:list) {
            System.out.println(str);
        }

//        set.add("tom");
        set.add(1);
        set.add(1);
        set.add(2);
        set.add("hello");
        set.add(1.1);
        set.add(true);
        set.add("world");
        System.out.println("size:"+set.size());
        for(Object obj:set) {
            System.out.println(obj);
        }
         */
    }
}
