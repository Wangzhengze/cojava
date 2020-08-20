package 代码的副本.chap06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    static final int N = 100000;
    static final List<Integer> val;
    static  {
        Integer[] values = new Integer[N];
        for(int i=0,current=0;i<N;i++) {
            values[i] = current;
            current += (int)(Math.random()*100);
        }
        //将包含10万条记录的数组转换成list集合
        val = Arrays.asList(values);
    }
    public static long getTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for(int i=0;i<list.size();i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(val);
        System.out.println("array:"+getTime(array));
//        List<Integer> link = new LinkedList<>(val);
//        System.out.println("linked:"+getTime(link));
    }
}
