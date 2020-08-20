package 代码的副本.chap06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String driver = "com.briup.bd2008.chap06.Student";
        Class cls = Class.forName(driver);
        Object o = cls.newInstance();
        if(o instanceof  Student) {
            Student s = (Student) o;
            s.setName("tom");
            s.setPassword(123);
            System.out.println(s);
        }
        /*
        String clsName = cls.getName();
        String modify = Modifier.toString(cls.getModifiers());
        System.out.println(modify+" class "+clsName+"{");
        getFiled(cls);
        getConstruct(cls);
        getMethod(cls);
        System.out.println("}");
        public class Student {
            public int id;
            public Student(){}
            public Student(int id){}
            public void test(){}
            ...
        }
         */
    }
    public static void getFiled(Class cls) {
        Field[] fields = cls.getFields();
        for(int i=0;i<fields.length;i++) {
            String modName = Modifier.toString
                    (fields[i].getModifiers());
            String typeName = fields[i].getType().getName();
            String fName = fields[i].getName();
            System.out.println("\t"+modName
                    +" "+typeName+" "+fName);
        }
    }
    public static void getConstruct(Class cls) {
        Constructor[] cons = cls.getDeclaredConstructors();
        for(int i=0;i<cons.length;i++) {
            String modName = Modifier.toString
                    (cons[i].getModifiers());
            String conName = cons[i].getName();
            System.out.print("\t"+modName+" "+conName+"(");
            Class[] c = cons[i].getParameterTypes();
            for(int j=0;j<c.length;j++) {
                String parName = c[j].getName();
                if(j>0)
                    System.out.print(",");
                System.out.print(parName);
            }
            System.out.println("){}");
        }
    }
    public static void getMethod(Class cls) {
        Method[] methods = cls.getDeclaredMethods();
        for(int i=0;i<methods.length;i++) {
            String modName = Modifier.toString
                    (methods[i].getModifiers());
            String typeName =
                    methods[i].getReturnType().getName();
            String methodName = methods[i].getName();
            System.out.print("\t"+modName+" "+typeName
                    +" "+methodName+"(");
            Class[] c = methods[i].getParameterTypes();
            for(int j=0;j<c.length;j++) {
                String parName = c[j].getName();
                if(j>0)
                    System.out.print(",");
                System.out.print(parName);
            }
            System.out.println("){}");
        }
    }
}
