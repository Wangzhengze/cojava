package day9_task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test_conflict {
    public static void main(String[] args) {
        Map<String,String> s=new HashMap<String, String>();
        s.put("ABCDEa123abc","xiao1");
        s.put("ABCDFB123abc","xiao2");
//        System.out.println(hash(1));
//        System.out.println(hash(19999));
    }
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
