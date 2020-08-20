package 代码的副本.chap06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    /*
     统计一句英语的各个单词出现的次数
     */
    public static void main(String[] args) {
        //接受console输入的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句英语,单词之间用空格隔开:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        //键代表单词，值代表次数
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else {
                //map中存在该key
                int num = map.get(arr[i]);
                map.put(arr[i],++num);
            }
        }
        System.out.println("统计单词出现的个数:");
        Set<Map.Entry<String, Integer>> entries =
                map.entrySet();
        for(Map.Entry<String,Integer> entry:entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
