package 代码的副本.chap09;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class ObjectTest2 {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        Client client = new Client(pos,"发送方");
        Server server = new Server(pis,"接收方");
        client.start();
        server.start();
    }
}
class Server extends  Thread {
    private PipedInputStream pis;
    public Server() {}

    public Server(PipedInputStream pis,String name) {
        this.pis = pis;
        setName(name);
    }

    @Override
    public void run() {
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(pis);
            System.out.println(getName()+"准备接受数据....");
            Set<Teacher> set = (Set<Teacher>)
                    ois.readObject();
            System.out.println(getName()+"数据接受完毕，准备打印输出...");
            for(Teacher t:set) {
                System.out.println(t);
            }
            System.out.println(getName()+"数据打印完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//解析文件,发送文件
class Client extends Thread {
    private PipedOutputStream pos;
    public Client() {}
    public Client(PipedOutputStream pos,String name) {
        this.pos = pos;
        setName(name);
    }
    @Override
    public void run() {
        try {
            InputStream is = new FileInputStream("src/test3.txt");
            BufferedReader br = new BufferedReader
                    (new InputStreamReader(is));
            String str = null;
            String[] s = null;
            Set<Teacher> set = new TreeSet<>();
            while((str = br.readLine())!=null) {
                s = str.split(":");
                Teacher teacher = new Teacher(
                        Integer.parseInt(s[0]),
                            s[1],Integer.parseInt(s[2]));
                set.add(teacher);
            }
            ObjectOutputStream oos =
                    new ObjectOutputStream(pos);
            oos.writeObject(set);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Teacher implements Serializable,Comparable<Teacher> {
    private int id;
    private String name;
    private int age;
    public Teacher() {}

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return age-o.getAge();
    }
}
