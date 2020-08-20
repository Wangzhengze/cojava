package chap06;

import day9_task.Student;
import sun.jvm.hotspot.HelloWorld;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import static java.lang.Class.forName;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class<Student> c1 = Student.class;
//        Class<chap01.Student> c2 = chap01.Student.class;
        Class<?> c2=Class.forName("chap01.Student");
//        Constructor<?>[] cons = c1.getDeclaredConstructors();
//        for (Constructor con : cons) {
//            System.out.println(con);
//        }
//        Field[] fields = c2.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//        Constructor<?> con = c1.getConstructor();
//        Object obj = con.newInstance();
//        Method m1 = c1.getMethod("method1");
//        m1.invoke(obj);

        Constructor<?>[] cons1=c2.getDeclaredConstructors();
        for (Constructor con1 : cons1) {
            System.out.println(con1);
        }
    }
}
