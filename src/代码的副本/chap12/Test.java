package 代码的副本.chap12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s[]={"小王","校长"};
        List<String> l=Arrays.asList(s);
        l.sort((o1,o2)->o1.compareTo(o2));
        l.forEach((i)-> System.out.println(i));
    }
}
