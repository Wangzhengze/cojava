package day9_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task_3 {
    public static int num_per_cls=50;
    public static int class_num=3;

    public static void main(String[] args) {
        List<Student> ls=init_list();
        Student temp;
        int grade[]=new int[class_num];
        Iterator<Student> iterator = ls.iterator();
        while(iterator.hasNext()){
            temp=iterator.next();
            int clas=Integer.valueOf(temp.getCls().substring(0, temp.getCls().indexOf("班"))).intValue();
            grade[clas-1]+=temp.getGrade();
        }
        for(int i=0;i<grade.length;i++){
            System.out.println("班级"+(i+1));
            System.out.println("总分"+grade[i]);
            System.out.println("平均"+grade[i]/num_per_cls);
        }

    }
    static public List<Student> init_list(){
        Random random=new Random();
        List<Student> ls=new ArrayList<Student>();
        for(int j=0;j<class_num;j++){
        for(int i=0;i<num_per_cls;i++){
            String name="小"+i;
            String cls=(j+1)+"班";
            int grade=(int)(random.nextGaussian()*10+80);
            ls.add(new Student(name,cls,grade));
        }

    }return ls;}




}
